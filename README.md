# Talking about Kotlin and TDD

[![Build Status](https://travis-ci.org/danilopaiva/kotlin-tdd-demo.svg?branch=master)](https://travis-ci.org/danilopaiva/kotlin-tdd-demo)
[![codecov](https://codecov.io/gh/danilopaiva/kotlin-tdd-demo/branch/master/graph/badge.svg)](https://codecov.io/gh/danilopaiva/kotlin-tdd-demo)

The main goal of this project is to show the basics of the programming language Kotlin and to demonstrate how to put into practice the TDD methodology while using Kotlin.
Therefore the examples in this project are simple but might not make sense without participation in the lecture. However, I’ll provide access to the presentation in the root of this project as complementary material.X

## KOTLIN

### [TOPIC-1](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic1.kthttps://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic1.kt)

**Kotlin file**

* .kt
* Many classes or functions per file

### [TOPIC-2](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic2.kt)

**Defining variables**

* Type inference
* Mutable and immutable variables

### [TOPIC-3](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic3.kt)

**Defining functions**

* One line function
* put default values
* No overload method
* Call in any order

### [TOPIC-4](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic4.kt)

**Data**

* Visibility modifiers
* Init
* getters/setters
* lazy

**Interface**

**Enum**

**Data class**

* put default values
* Properties in any order to create
* Methods get/set/toString/hashCode
* Update properties
* Copy
* Qualified this

### [TOPIC-5](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic5.kt)

**Unit Test**

* full phrases for method names
* asserts
* exceptions

**Helpers**

* String Template
* to do functions
* measureTimeMillis { } Nanos
* deprecation message, levels and replacements
* Erasing Erasure
* Java to kotlin, kotlin to java decompiler

### [TOPIC-6](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic6.kt)

**Destructuring Declarations**

### [TOPIC-7](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic7.kt)

**Null Safety**

* Nullable types and Non-Null Types
* Checking for null in conditions
* Elvis Operator
* Safe calls
* The !! operator

### [TOPIC-8](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic8.kt)

**Equality**

* Structural equality
* Referential equality

## [TOPIC-9](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic9.kt)

**Returning from a code block**

* if else
* try/catch
* when
* Unit, Nothing

### [TOPIC-10](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic10.kt)

**Type Checks and Casts: 'is' and 'as'**

* is and !is Operators
* Smart Casts
* "Unsafe" cast operator
* "Safe" (nullable) cast operator

### [TOPIC-11](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic11.kt)

**Extension function**
* Infix

### [TOPIC-12](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic12.kt)

**Operator Overloading**
* Increments and decrements
* Binary operations

### [TOPIC-13](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic13.kt)

**Lambda**

### [TOPIC-14](https://github.com/danilopaiva/kotlin-tdd-demo/blob/master/src/test/kotlin/com/github/danilopaiva/demo/kotlin/Topic14.kt)

**Ranges**

**Collections**

* List, mutableList, map, mutableMap
* Filter, map, reduce, fold, foldRight, any, none, all, first, find
* Sorting
* Partition
* Zip
* Group by

### Delegate

### let, also, apply, with, run

## TDD

Criar um repositório e o domínio que simule uma conta bancária. A conta deve realizar as operações de depósito e saque, respeitando as seguintes regras:

**Repository:**
* Deve salvar uma conta
* Deve buscar uma conta
* Deve atualizar uma conta

**Domain**
* Deve criar uma conta
* Deve depositar um valor na conta
* Não deve realizar deposito quando o status da conta não está ativo
* Deve sacar um valor da conta
* O saldo da conta nunca pode ser inferior a zero

## References

### KOTLIN

* [Kotlin](https://kotlinlang.org) - Official Page
* [Functional Kotlin](https://www.amazon.com.br/gp/product/B078JRKFYF/ref=oh_aui_d_detailpage_o01_?ie=UTF8&psc=1) - Extend your OOP skills and implement Functional techniques in Kotlin and Arrow
* [Mike Matsumoto](https://github.com/mmatsumoto/kotlin-webinar)

### TDD

* [Test-Driven Development](https://www.amazon.com/Test-Driven-Development-Kent-Beck/dp/0321146530/ref=sr_1_3?ie=UTF8&qid=1539657422&sr=8-3&keywords=test+driven+development) - By Example, Kent Beck
* [Test-Driven Development](https://www.casadocodigo.com.br/products/livro-tdd) - Teste e Design no Mundo Real