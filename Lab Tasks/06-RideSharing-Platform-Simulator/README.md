# Experiment 6: Ride Sharing Platform Simulator Using OOP and Polymorphism

## 📝 Problem Statement
Simulate a ride-sharing platform that calculates trip fares based on the type of vehicle booked (Bike, Auto, Cab). The system must reject invalid vehicle types and invalid distances.

## 🧠 Core Concepts
- **Inheritance & Abstraction**: Using an abstract parent class (`Vehicle`) to define a common interface.
- **Runtime Polymorphism (Method Overriding)**: Subclasses providing specific implementations of `calculateFare()`.
- **Custom Exceptions**: Creating and throwing checked exceptions (`InvalidBookingException`) for robust error handling.

## ⚙️ Algorithmic Approach & Logic
1. **Class Hierarchy**:
   - `Vehicle` is an abstract class with an abstract method `calculateFare(int distance)`.
   - `Bike`, `Auto`, and `Cab` extend `Vehicle` and override the fare calculation method with their own rate logic (e.g., Bike is $5$/km, Auto is $12$/km).
2. **Trip Validation & Exception Handling**:
   - The `Trip` constructor accepts the distance and vehicle. If the distance $\le 0$, it throws a custom `InvalidBookingException`.
   - Similarly, if the requested ride type isn't recognized, an exception is thrown before the trip is created.
3. **Dynamic Dispatch**:
   - When `trip.getFare()` is called, it invokes `vehicle.calculateFare(distance)`.
   - Because of polymorphism, Java dynamically determines at runtime which specific class's method to execute based on whether the vehicle is a `Bike`, `Auto`, or `Cab`.

## ⏱️ Complexity Analysis
- **Time Complexity**: $\mathcal{O}(N)$ where $N$ is the number of ride queries. Object instantiation and method dispatch operate in $\mathcal{O}(1)$ time.
- **Space Complexity**: $\mathcal{O}(1)$ as objects are created and discarded per query without needing to store the entire history of trips.

## 🚀 How to Run

### Compilation and Execution
```bash
javac Task6.java
java Task6
```

### Input Format
```text
n
type_1 distance_1
type_2 distance_2
...
```
*(Valid types: `Bike`, `Auto`, `Cab`)*

### Sample Input/Output
**Input:**
```text
3
Bike 10
Auto 5
Helicopter 100
```
**Output:**
```text
50
60
Invalid ride type
```
