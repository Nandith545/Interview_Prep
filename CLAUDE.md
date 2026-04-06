# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Overview

This is a Java-based interview preparation repository with two tracks:

- **Root directory** — LeetCode problems, named `ProblemName_LC_<number>.java` (e.g., `GroupAnagrams_LC_49.java`)
- **Structy/** — Topic-organized algorithm problems from the Structy course, organized by category: `Introduction/`, `Hashing/`, `LinkedList/`, `Recursion_Beginner/`, `BinaryTree/`, `Graphs/`, `TwoPointer/`

## Running Code

Java files are standalone — no build system or package manager. Each file is compiled and run directly:

```bash
javac SomeFile.java
java Solution       # for LeetCode files (class name is Solution)
java Source         # for Structy files (class name is Source)
```

## Code Conventions

**LeetCode files:**
- Class name: `Solution`
- No package declarations
- Imports omitted (LeetCode runtime provides them), so raw type references like `HashMap`, `ArrayList`, `List` are used without import statements

**Structy files:**
- Class name: `Source`
- Contains a `run()` method as the entry point for sandboxing
- Includes complexity annotations at the bottom as a comment block:
  ```java
  /*
      n = length of input
      Time: O(n)
      Space: O(1)
  */
  ```
- May have `_Iterative` and `_Recursive` variants of the same problem as separate files

## Duplicate Files

Some problems have multiple solution files (e.g., `IsomorphicStrings_LC_205.java` and `IsomorphicStrings1_LC_205.java`, `NumberIslands_LC_200.java` and `NumberOfIslands_LC_200.java`). These represent different solution approaches for the same problem — both are intentional.
