## 🌳 StudentGradesTree

A simple Java-based system to manage student records using a Binary Search Tree (BST).

## Features

- Insert students with ID, name, and three grades
- Search for a student by ID
- List all students sorted by ID
- Update a student's grades

## How It Works

The program reads user commands and executes corresponding actions on the BST:

- `INSERIR ID "Student Name" grade1 grade2 grade3` — Insert a student  
- `BUSCAR ID` — Search for a student by ID  
- `LISTAR_POR_ID` — List all students in ascending ID order  
- `ATUALIZAR_NOTAS ID grade1 grade2 grade3` — Update student’s grades  

> Note: Commands are in Portuguese as the input interface was built for Portuguese-speaking users.

## Project Structure

- `Main.java`: Entry point, handles input and command parsing  
- `Aluno.java`: Represents the student object  
- `Btree.java`: Manages the binary search tree logic  
- `Bnode.java`: Defines the structure and operations of each tree node  

## Example



Feito com 💻 por [Roland dos Santos Bittencourt de Castro](https://github.com/LandsBitt)
