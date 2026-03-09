# Java Praktikum 2016

This project contains a collection of Java exercises and small programs developed during an internship in July 2016.

## Requirements

- Java 8 or higher (tested with Java 21)
- Gradle

## Building the Project

To compile the project and run tests, use the following command:

```bash
./gradlew build
```

## Running the Programs

Since this project contains multiple main classes, you can run them using the `java` command after building:

```bash
java -cp build/classes/java/main jan.praktikum.<ClassName>
```

Replace `<ClassName>` with one of the following:

- `Anrede`: Interactive greeting program.
- `DasKleineEinmaleins`: Prints a 10x10 multiplication table.
- `FizzBuzz`: A simple FizzBuzz implementation.
- `HelloWorld`: The classic "Hello World!" program.
- `Kassenbon`: A simulated cash register receipt program.
- `LargeConversation`: An interactive chatbot named Siri.
- `RandomZahl`: Continuously generates and prints random numbers.
- `SmallConversation`: A short interactive dialogue.
- `ZZZZZnake`: A terminal-based snake game. Use 'h' (up), 't' (down), 'l' (left), 'r' (right) to move.
- `ZweiUndVierzigProzent`: A game of chance with a 42% win rate.

## Utility Classes

- `Terminal`: A helper class for simplified console input and output.

## Tests

The project includes JUnit tests. You can run them with:

```bash
./gradlew test
```
