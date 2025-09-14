# Take-home-tana-test
Assessment solution for Tufin company.
## 1 Longest String
1. The string should have non-repetitive identical characters, for example 'AABCD' is not valid since it contains 'AA'.
2. The string should only contain the characters among given list of valid characters. Function parameters: - characters - List of valid characters. - strings - Array of Strings

### Setup
#### 1. Download Required JARs
nit-jupiter-api-5.10.2.jar

junit-platform-console-standalone-1.10.2.jar


---

### 2. Compile

Run the following command to compile the source and test files:

```bash
javac -cp "lib/junit-jupiter-api-5.10.2.jar" -d out LongestString.java LongestStringTest.java
```
### 3. Run

```bash
java -jar lib/junit-platform-console-standalone-1.10.2.jar -cp out --select-class LongestStringTest
```

## 2 First Unique product 

A program that, efficiently with respect to time and space used, finds the first product in an array that occurs only once in that array. If there are no unique products in the array, null.

### 2. Compile

Run the following command to compile the source and test files:

```bash
javac -cp "lib/junit-jupiter-api-5.10.2.jar" -d out FirstUniqueProduct.java FirstUniqueProductTest.java
```
### 3. Run

```bash
java -jar lib/junit-platform-console-standalone-1.10.2.jar -cp out --select-class FirstUniqueProduct
```
## 3 Minimum distance between two minimums

A function that finds the distance between the two closest (nearest) minimums in it. It is guaranteed that in the array a minimum occurs at least two times.

### 2. Compile

Run the following command to compile the source and test files:

```bash
 javac -cp "lib/junit-jupiter-api-5.10.2.jar" -d out MinimumDistance.java MinimumDistanceTest.java```
### 3. Run

```bash
java -jar lib/junit-platform-console-standalone-1.10.2.jar -cp out --select-class MinimumDistanceTest
```

## 4 Most common 3

The program returns the three most common strings it.
### 2. Compile

Run the following command to compile the source and test files:

```bash
javac -cp "lib/junit-jupiter-api-5.10.2.jar" -d out MostCommonThree.java MostCommonThreeTest.java
````
### 3. Run

```bash
 java -jar lib/junit-platform-console-standalone-1.10.2.jar -cp out --select-class MostCommonThree
 ```

## 5 Rotate List

The program rotates a list by moving each element in the list n times to the right.
### 2. Compile

```bash
javac -cp "lib/junit-jupiter-api-5.10.2.jar" -d out RotateList.java RotateListTest.java
````
### 3. Run

```bash
java -jar lib/junit-platform-console-standalone-1.10.2.jar -cp out --select-class RotateList
```