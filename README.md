# GRUPO-03-METODOS-en-java-

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

---

##  Información General

* **Carrera:** Ingeniería en Software  
* **Asignatura:** Algoritmos y Lógica de Programación  
* **Nivel / Parallelo:** Primer Semestre — Paralelo B  
* **Actividad:** APE 4 – Métodos en java  
* **Modalidad:** Presencial  
* **Integrantes:** Adrián Andaluz, Ariel Chanatasig, Paulo Escobar, Mateo Salazar

---
## Ejercicio 1: Identificación de tipos de retorno

### 📌 Enunciado
Dado el siguiente método en Java, se analiza por qué genera un error de compilación y cómo se corrige[cite: 2]:

\`\`\`java
public int calcularArea(double base, double altura) {
    double area = base * altura;
    System.out.println("El área es: " + area);
}
\`\`\`

---

### 🔍 Análisis del Error de Compilación

El fragmento anterior genera un error de compilación por dos motivos fundamentales:

1. **Falta de sentencia de retorno (`return`):** El método está declarado con el tipo de retorno **`int`** (`public int ...`), lo que obliga por norma en Java a que el bloque de código devuelva un valor entero mediante la instrucción `return`[cite: 2]. Al no incluirla, el compilador se detiene.
2. **Incompatibilidad de tipos:** La operación `base * altura` involucra valores de tipo `double`, por lo que la variable `area` es de tipo `double`[cite: 2]. Intentar retornar un valor `double` (o no retornar nada) en un método que promete devolver un `int` rompe las reglas de tipado estático de Java.

---

### 🛠️ Soluciones Posibles

Dependiendo del diseño que necesites, existen dos formas correctas de solucionarlo:

#### Opción 1: Cambiar el tipo de retorno a `void` (Recomendada)
Si el propósito del método es únicamente calcular e imprimir el resultado por consola, no es necesario que retorne ningún valor[cite: 2]. Basta con cambiar `int` por `void`:

\`\`\`java
public void calcularArea(double base, double altura) {
    double area = base * altura;
    System.out.println("El área es: " + area);
    // Al ser void, no se requiere la instrucción return
}
\`\`\`

#### Opción 2: Mantener el tipo `int` y retornar el valor con conversión explícita
Si el método estrictamente necesita devolver un valor entero, debes realizar un *cast* (conversión) del resultado y agregar el `return` al final:

\`\`\`java
public int calcularArea(double base, double altura) {
    int area = (int) (base * altura); // Conversión explícita de double a int
    System.out.println("El área es: " + area);
    return area; // Sentencia de retorno obligatoria
}
\`\`\`

---
