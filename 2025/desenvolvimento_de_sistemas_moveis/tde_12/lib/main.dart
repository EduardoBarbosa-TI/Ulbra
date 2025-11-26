import 'package:tde_12/models/character.dart';
import 'package:tde_12/services/character_service.dart';
import 'package:tde_12/views/character_detail.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  CharacterService service = CharacterService();

  late Future<List<Character>> _gamesFuture;
  late List<Character> _games;
  late List<Character> _gamesFiltrados;

  @override
  void initState() {
    super.initState();
    _gamesFuture = _getCharacter();
  }

  Future<List<Character>> _getCharacter() async {
    _games = await service.getCharacters();
    _gamesFiltrados = _games;
    return _games;
  }

  _filterGames(String filter) {
    setState(() {
      _gamesFiltrados = _games
          .where(
            (item) => item.title.toLowerCase().contains(filter.toLowerCase()),
      )
          .toList();
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: Text("Jogos")),
        body: Column(
          children: [
            Padding(
              padding: const EdgeInsets.all(20),
              child: TextField(
                onChanged: (value) {
                  _filterGames(value);
                },
                decoration: InputDecoration(
                  border: OutlineInputBorder(),
                  labelText: "Filtro",
                ),
              ),
            ),
            FutureBuilder<List<Character>>(
              future: _gamesFuture,
              builder: (context, snapshot) {
                if (snapshot.hasData) {
                  return Expanded(
                    child: Padding(
                      padding: const EdgeInsets.all(20),
                      child: ListView.separated(
                        itemBuilder: (context, index) {
                          return ListTile(
                            title: Text(_gamesFiltrados[index].title),
                            leading: Image.network(_gamesFiltrados[index].thumbnail),
                            onTap: () {
                              Navigator.push(
                                context,
                                MaterialPageRoute(
                                  builder: (context) => CharacterDetailPage(
                                    character: _gamesFiltrados[index],
                                  ),
                                ),
                              );
                            },
                          );
                          ;
                        },
                        separatorBuilder: (context, int) {
                          return Divider();
                        },
                        itemCount: _gamesFiltrados.length,
                      ),
                    ),
                  );
                }
                if (snapshot.hasError) {
                  return Text("Error");
                }

                return CircularProgressIndicator();
              },
            ),
          ],
        ),
      ),
    );
  }
}
