# Experiment 2: Real-Time Stream Analytics Engine Using Stream Processing Concepts

## 📝 Problem Statement
Simulate a stream of sensor readings where each reading consists of a `Sensor ID` and a `Temperature`. The engine must filter out any readings where the temperature is $\le 50$, compute the average temperature for each valid sensor, and output the sensors sorted by their average temperature in descending order.

## 🧠 Core Concepts
- **Hash Maps**: Grouping elements using `Map<String, List<Integer>>` and the efficient `computeIfAbsent()` method.
- **Java Stream API**: Advanced pipelining including `mapToInt()`, `average()`, and `sorted()`.
- **Custom Comparators**: Sorting map entries based on their values (averages).

## ⚙️ Algorithmic Approach & Logic
1. **Data Ingestion & Filtering**: We read pairs of `(ID, Temperature)`. If the temperature $> 50$, we add it to the list of readings for that ID using `map.computeIfAbsent(id, k -> new ArrayList<>()).add(temp)`.
2. **Transformation (`map`)**: We stream the map's entry set. For each entry (a Sensor ID and its list of temperatures), we transform the list into an `IntStream`, compute its average using `.average().orElse(0.0)`, and return a new key-value pair of `(ID, Average)`.
3. **Sorting**: We use `.sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))` to sort the new entries in descending order based on the calculated averages.
4. **Consumption**: `.forEach()` prints the final sorted IDs and their averages.

## ⏱️ Complexity Analysis
- **Time Complexity**: 
  - Grouping: $\mathcal{O}(N)$ where $N$ is the number of valid sensor readings.
  - Averaging: $\mathcal{O}(N)$ to calculate the averages across all elements.
  - Sorting: $\mathcal{O}(U \log U)$ where $U$ is the number of *unique* sensor IDs.
  - Overall Time Complexity: $\mathcal{O}(N + U \log U)$.
- **Space Complexity**: $\mathcal{O}(N)$ to store the map containing all valid readings grouped by sensor ID.

## 🚀 How to Run

### Compilation and Execution
```bash
javac Task2.java
java Task2
```

### Input Format
```text
n
id_1 temp_1
id_2 temp_2
...
```

### Sample Input/Output
**Input:**
```text
4
S1 60
S2 45
S1 70
S3 80
```
**Output:**
```text
S3 80.0
S1 65.0
```
