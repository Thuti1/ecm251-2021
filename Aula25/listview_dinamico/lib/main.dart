import 'package:flutter/material.dart';
import 'package:listview_dinamico/pessoa.dart';
import 'package:listview_dinamico/random_users.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        // This is the theme of your application.
        //
        // Try running your application with "flutter run". You'll see the
        // application has a blue toolbar. Then, without quitting the app, try
        // changing the primarySwatch below to Colors.green and then invoke
        // "hot reload" (press "r" in the console where you ran "flutter run",
        // or simply save your changes to "hot reload" in a Flutter IDE).
        // Notice that the counter didn't reset back to zero; the application
        // is not restarted.
        primarySwatch: Colors.blue,
      ),
      home: const MinhaListaDinamica(),
    );
  }
}

class MinhaListaDinamica extends StatefulWidget {
  const MinhaListaDinamica({Key? key}) : super(key: key);

  @override
  State<MinhaListaDinamica> createState() => _MinhaListaDinamicaState();
}

class _MinhaListaDinamicaState extends State<MinhaListaDinamica> {
  List<Pessoa> pessoas = [
    Pessoa(
        nome: "Pikachu",
        url: "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png",
        subText: "Elétrico"),
    Pessoa(
        nome: "Raichu",
        url: "https://assets.pokemon.com/assets/cms2/img/pokedex/full/026.png",
        subText: "Elétrico"),
    Pessoa(
        nome: "Sandshrew",
        url: "https://assets.pokemon.com/assets/cms2/img/pokedex/full/027.png",
        subText: "Terrestre")
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Minha Lista Dinâmica"),
      ),
      body: ListView.builder(
          itemCount: pessoas.length,
          itemBuilder: (context, itemIndex) {
            return ListTile(
              title: Text("${pessoas[itemIndex].nome}"),
              leading: Image.network("${pessoas[itemIndex].url}"),
              subtitle: Text("${pessoas[itemIndex].subText}"),
            );
          }),
      floatingActionButton: FloatingActionButton(
        onPressed: () async {
          NetworkHelper helper = NetworkHelper(url: "");
          RandomUsers randomUsers =
              RandomUsers.fromJson(await helper.getData());
          //Colocar mais usuários
          randomUsers.results.forEach((element) {
            pessoas.add(Pessoa(
                nome: "${element.name!.first} ${element.name!.last}",
                url: element.email!,
                subText: element.picture!.medium!));
          });
          setState(() {});
        },
        child: Icon(Icons.search_sharp),
      ),
    );
  }
}
