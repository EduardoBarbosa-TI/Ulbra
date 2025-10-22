import 'dart:math';

import 'package:flutter/material.dart';
import 'package:tde_widgets_2/widgets/languages_widget.dart';

class MyHomePage extends StatefulWidget {
  final String title;

  const MyHomePage({super.key, required this.title});

  @override
  State<StatefulWidget> createState() => _MyHomePage();
}

class _MyHomePage extends State<MyHomePage> {
  late Color _appBarColor;
  final TextEditingController _controller = TextEditingController();
  String _filter = "";

  _changeColorAppBar() {
    _appBarColor = Colors.primaries[Random().nextInt(Colors.primaries.length)];
  }

  @override
  void initState() {
    super.initState();
    _appBarColor = Colors.blueAccent;
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: _appBarColor,
          title: Text(widget.title),
          actions: [
            IconButton(
              onPressed: () {
                setState(() {
                  _changeColorAppBar();
                });
              },
              icon: Icon(Icons.color_lens_rounded),
            ),
          ],
        ),
        body: Languages(filter: _filter),
        bottomSheet: Padding(
          padding: const EdgeInsets.all(16),
          child: Row(
            children: [
              Expanded(
                child: TextField(
                  controller: _controller,
                  onChanged: (text) {
                    setState(() {
                      _filter = text;
                    });
                  },
                  decoration: const InputDecoration(
                    border: OutlineInputBorder(),
                    hintText: "Filtro",
                    label: Text("Filtro"),
                  ),
                ),
              ),
              ElevatedButton(
                onPressed: () {
                  setState(() {
                    _filter = _controller.text;
                  });
                },
                child: Text("Filtrar"),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
