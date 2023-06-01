import 'package:flutter/material.dart';
import 'package:flutter/src/widgets/framework.dart';
import 'package:flutter/src/widgets/placeholder.dart';
import 'package:material_floating_search_bar/material_floating_search_bar.dart';
import 'package:skysight/pages/pages.dart';
import 'package:skysight/widgets/main_info.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: FloatingSearchAppBar(
        color: Color.fromRGBO(109, 93, 110, 1),
        body: SafeArea(
            child: Column(
          children: [
            Center(
              child: MainInfo(),
            )
          ],
        )),
      ),
    );
  }
}
