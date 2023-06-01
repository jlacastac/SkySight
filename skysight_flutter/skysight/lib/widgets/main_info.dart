import 'package:flutter/material.dart';
import 'package:flutter_svg/flutter_svg.dart';
import 'package:google_fonts/google_fonts.dart';

class MainInfo extends StatelessWidget {
  const MainInfo({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
        width: 350,
        height: 300,
        decoration: const BoxDecoration(
          borderRadius: BorderRadius.all(Radius.circular(20)),
          color: Color.fromRGBO(109, 93, 110, 0.65),
        ),
        child: Padding(
          padding: const EdgeInsets.only(top: 15),
          child: Column(children: [
            Text(
              "Teruel",
              style: TextStyle(
                  letterSpacing: 3,
                  fontFamily: GoogleFonts.poppins().fontFamily,
                  fontSize: 32,
                  color: Color.fromRGBO(244, 238, 224, 0.8)),
            ),
            const Text(
              "15/04/2023",
              style: TextStyle(
                  fontSize: 16,
                  letterSpacing: 8,
                  color: Color.fromRGBO(244, 238, 224, 0.4)),
            ),
            const Padding(
              padding: EdgeInsets.only(top: 30, left: 20),
              child: Text("38º",
                  style: TextStyle(
                      fontSize: 70, color: Color.fromRGBO(244, 238, 224, 0.8))),
            ),
            Padding(
              padding: const EdgeInsets.only(top: 10),
              child: SvgPicture.asset(
                'assets/sun.svg',
                width: 65,
              ),
            )
          ]),
        ));
  }
}
