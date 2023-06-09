import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:skysight/pages/home_page.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Skysight',
      theme: ThemeData(
          scaffoldBackgroundColor: Color.fromRGBO(57, 54, 70, 0.5),
          fontFamily: GoogleFonts.getFont('Overpass').fontFamily),
      home: HomePage(),
    );
  }
}
