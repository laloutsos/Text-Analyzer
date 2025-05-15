# 📚 Text Analyzer (Under Development)

**Text Analyzer** is a Java-based project that uses a Trie (prefix tree) data structure to efficiently store, query, and analyze words from a large text file. It supports word frequency tracking, prefix-based searches, pattern matching with wildcards, and more.

---

## 🚀 Features

- ✅ Insert and store words from a text file using a Trie
- 🔍 Check if a word exists and how many times it appears
- 📌 Find the number of words with a specific prefix
- ✨ List all words with a given prefix along with their frequencies
- ❓ Search for words that match a pattern using wildcards (e.g., `sc????e`)
- 🔡 Find the **longest prefix** of a given word found in the text
- 🏆 Identify the **most frequent** word in the text
- 🗑️ Delete words and update the structure accordingly
- 📦 Efficient memory usage and fast lookup operations

---

## 🧪 Example Use Case

The program reads from a file (e.g., `DickensB.txt`) and performs various operations like:

```bash
- Total word count and memory usage
- Check if "astonished" or "carol" exists
- Search all words with prefix "caro"
- Search words matching pattern "sc????e"
- Find the most frequent word
```
## 🔧 How It Works

The core of the project is the `StringTrie` class, which:

- Inserts words character-by-character into a tree structure  
- Tracks how many times each word appears  
- Supports retrieval based on exact match, prefix, and pattern  
- Offers frequency statistics for every word in the text  

---

## 📂 Structure

- `Main.java`: Loads a text file and interacts with the Trie  
- `StringTrie.java`: Core Trie implementation  
- `Item.java`: Simple data class holding word and its count  
- `Node.java`: Represents a single node in the Trie structure
- `Q.java`: An array-based circular queue implementation with generic support

---

## ⚠️ Development Status

This project is still under active development.  
Features might change and improvements are in progress.  
**Contributions and suggestions are welcome!**
