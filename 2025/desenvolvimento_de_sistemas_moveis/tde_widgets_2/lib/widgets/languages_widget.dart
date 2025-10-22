import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

List<String> languages = [
  'Dart',
  'Java',
  'Kotlin',
  'Swift',
  'Objective-C',
  'JavaScript',
  'Python',
  'C#',
  'C++',
  'Ruby',
  'Go',
  'Rust',
  'PHP',
  'TypeScript',
  'Scala',
  'Perl',
  'R',
  'Haskell',
  'Elixir',
  'C',
  'Lua',
  'Shell',
  'SQL',
  'HTML',
  'CSS',
  'Visual Basic',
  'MATLAB',
  'Assembly',
  'Groovy',
  'Julia',
  'Fortran',
  'COBOL',
];

class Languages extends StatefulWidget {
  final String filter;

  const Languages({super.key, required this.filter});

  _filterLanguage() {
    return languages
        .where(
          (element) => element.toLowerCase().contains(filter.toLowerCase()),
        )
        .toList();
  }

  @override
  State<Languages> createState() => _LanguagesState();
}

class _LanguagesState extends State<Languages> {
  List<String> languagesFiltered = [];

  @override
  void didUpdateWidget(covariant Languages oldWidget) {
    if (oldWidget.filter != widget.filter) {
      languagesFiltered = widget._filterLanguage();
    }
    super.didUpdateWidget(oldWidget);
  }

  @override
  void initState() {
    languagesFiltered = widget._filterLanguage();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(bottom: 8.0),
      child: SizedBox(
        height: MediaQuery.of(context).size.height * 0.7,
        child: ListView.separated(
          itemBuilder: (BuildContext context, int indexLanguages) {
            return ListTile(
                leading: const Icon(Icons.rocket_launch_outlined),
                title: Text(languagesFiltered[indexLanguages]),
               subtitle: Text("Melhor linguagem do mundo"),
            );
          },
          separatorBuilder: (BuildContext context, int indexLanguages) {
            return const Divider();
          },
          itemCount: languagesFiltered.length,
        ),
      ),
    );
  }
}
