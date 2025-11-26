import 'dart:convert';

import 'package:tde_12/constants.dart';
import 'package:tde_12/models/character.dart';
import 'package:flutter/cupertino.dart';
import 'package:http/http.dart' as http;


class CharacterService {
  Future<List<Character>> getCharacters() async {
    final response = await http.get(Uri.parse(BASE_URL));

    if (response.statusCode == 200) {
      List jsonResponse = json.decode(response.body);
      return jsonResponse.map((item) => Character.fromJson(item)).toList();
    } else {

      throw Exception("Erro ao buscar os dados");
    }
  }
}