# Livecoding: Polymorphism and Method Overloading in Java

An educational repository focusing on core Object-Oriented Programming (OOP) concepts in Java: **Inheritance**, **Dynamic Polymorphism (Late Binding)**, and **Method Overloading**.

---

## 🛠️ Tech Stack
- **Language:** Java (JDK 17+)
- **IDE:** Eclipse IDE
- **VCS:** Git & GitHub

---

## 📂 Project Structure & Exercises

### 1. Basic Overloading (`esercizio_1/ServizioNotifiche.java`)
Demonstration of **Method Overloading**:
- Three methods sharing the same identifier with different signatures (parameter count and types).
- Compile-time method resolution (*early binding*).

### 2. Advanced Calculator (`esercizio_2/CalcolatriceAvanzata.java`)
Extension of fundamental arithmetic operations (`add`, `subtract`, `multiply`, `divide`):
- Overloaded methods accepting **2 decimal parameters** (`double`).
- Overloaded methods accepting **3 decimal parameters** (`arg1 - arg2 - arg3`).
- Overloaded methods accepting an **array of decimals** (`double[]`) to process arbitrary sequences of operands.
- Separation of concerns: methods compute and return values (`return`), leaving I/O handling to caller classes.

### 3. CLI & Testing (`esercizio_3/TestCalcolatriceAvanzata.java`)
Console testing and user interaction:
- Console input capture using `Scanner`.
- Input validation and presentation of results returned by `CalcolatriceAvanzata`.

### 4. University Tuition Management System (`esercizio_4/`)
Domain modeling with parametric tuition calculations:
- **`Studente`**: Base class holding personal details, ISEE, academic year, and standard tuition bracket calculation (€500, €700, €1200).
- **`Triennale` & `Magistrale`**: Subclasses encapsulating legal program length (3 vs. 2 years), extra tuition percentage rates (+10% vs. +15%), and late-year penalty caps (max 3 years vs. max 2 years).
- **`GestioneTasse`**:
  - Uses a **polymorphic parameter** (`calcolaTasse(Studente s)`) to leverage late binding at runtime.
  - Method overload for batch processing via heterogeneous arrays (`Studente[]`).
  - Combined use of `Math.max` and `Math.min` to bound late-registration brackets and eliminate hardcoded magic numbers.

---

## 🚀 Running the Project
To compile and execute the modules from the terminal:

```bash
# Compile sources into the bin directory
javac -d bin src/**/*.java

# Run Tuition Calculation Test
java -cp bin esercizio_4.GestioneTasse

# Run Calculator Test
java -cp bin esercizio_3.TestCalcolatriceAvanzata
