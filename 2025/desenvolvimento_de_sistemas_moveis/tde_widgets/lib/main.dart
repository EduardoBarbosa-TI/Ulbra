import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return const MaterialApp(home: MyHomePage(title: "Kevin Levrone"));
  }
}

class MyHomePage extends StatelessWidget {
  final String title;

  const MyHomePage({super.key, required this.title});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.black,
        title: Center(
          child: Text(
            title,
            style: const TextStyle(
              color: Colors.white,
              fontSize: 28,
              fontWeight: FontWeight.w800,
            ),
          ),
        ),
      ),
      body: SingleChildScrollView(
        child: const Column(
          children: [
            ImageDemo(),
            Description(),
            Icones(),
            Padding(
              padding: EdgeInsets.all(32),
              child: Text("Kevin Levrone is one of the greatest names in bodybuilding history. Known as “The Maryland Muscle Machine,” he stood out in the 1990s for his impressive and aesthetic physique. He was a four-time Mr. Olympia runner-up, becoming a legend without ever winning the title. Levrone became famous for transforming his body quickly before competitions. In 2016, he made a comeback at 51, proving his passion for the sport. Today, he remains an inspiration to athletes worldwide"),
            ),
          ],
        ),
      ),
    );
  }
}

class ImageDemo extends StatelessWidget {
  const ImageDemo({super.key});

  @override
  Widget build(BuildContext context) {
    return Image.network(
      "https://tse1.explicit.bing.net/th/id/OIP.yXfw-80v3jVzrGtqCQ29EQHaHa?cb=12&rs=1&pid=ImgDetMain&o=7&rm=3",
      fit: BoxFit.cover,
      height: 400,
      width: MediaQuery.of(context).size.width,
    );
  }
}

class Description extends StatelessWidget {
  const Description({super.key});

  @override
  Widget build(BuildContext context) {
    return const Padding(
      padding: EdgeInsets.all(32),
      child: Row(
        children: [
          Expanded(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Padding(
                  padding: EdgeInsets.symmetric(vertical: 8.0),
                  child: Text(
                    "King without a crown",
                    style: TextStyle(fontSize: 18, fontWeight: FontWeight.w600),
                  ),
                ),
                Text(
                  "1992 - 1995 - 2000 - 2002",
                  style: TextStyle(fontSize: 18, color: Colors.grey),
                ),
              ],
            ),
          ),
          Icon(Icons.star, color: Colors.red),
          Text("100"),
        ],
      ),
    );
  }
}

class IconWithText extends StatelessWidget {
  final IconData icon;
  final Color colorIcon;
  final double sizeIcon;
  final String text;
  final Color colorText;

  const IconWithText({
    super.key,
    required this.icon,
    required this.colorIcon,
    required this.sizeIcon,
    required this.text,
    required this.colorText,
  });

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Padding(
          padding: const EdgeInsets.symmetric(vertical: 8.0),
          child: Icon(icon, color: colorIcon, size: sizeIcon),
        ),
        Text(text, style: TextStyle(color: colorText)),
      ],
    );
  }
}

class Icones extends StatelessWidget {
  const Icones({super.key});

  @override
  Widget build(BuildContext context) {
    return const Row(
      children: [
        Expanded(
          child:  Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              IconWithText(
                icon: Icons.call,
                colorIcon: Colors.black,
                sizeIcon: 30,
                text: "CALL",
                colorText: Colors.black,
              ),
              IconWithText(
                icon: Icons.near_me,
                colorIcon: Colors.black,
                sizeIcon: 30,
                text: "ROUTE",
                colorText: Colors.black,
              ),
              IconWithText(
                icon: Icons.share,
                colorIcon: Colors.black,
                sizeIcon: 30,
                text: "SHARE",
                colorText: Colors.black,
              ),
            ],
          ),
        ),
      ],
    );
  }
}
