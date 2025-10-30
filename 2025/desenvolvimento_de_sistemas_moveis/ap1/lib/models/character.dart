import 'dart:ffi';

class Character {
  final String title;
  final String thumbnail;

  const Character({required this.title, required this.thumbnail});

  factory Character.fromJson(Map<String, dynamic> json) {
    return Character(title: json["title"], thumbnail: json["thumbnail"]);
  }
}