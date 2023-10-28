# Spring Framework Hello World

This repository contains a simple Java application that demonstrates the usage of Spring Framework. The code in the `MainClass` file showcases how to configure and work with Spring beans. In this README, we'll provide an overview of the code and explain how qualifiers and the `@Primary` annotation are used to handle situations where matching beans (candidates) are available.

## Code Overview

### MainClass

The `MainClass` serves as the entry point for the application. It demonstrates the following:

1. Launching a Spring context using `AnnotationConfigApplicationContext`.

2. Retrieving and printing various Spring-managed beans, including beans of type `String`, `Address`, and `Person`.

### HelloWorldConfiguration

The `HelloWorldConfiguration` class is annotated with `@Configuration` to indicate that it provides Spring bean configurations. It defines several bean creation methods, including:

- `name()`: Creates a `String` bean with the name "Ranga."
- `age()`: Creates an `int` bean with the value 12.
- `person()`: Creates a `Person` bean with name "Ibtihaj," age 22, and an `Address` bean.
- `person2MethodCall()`: Creates a `Person` bean using `name()`, `age()`, and `address()` methods.
- `person3Parameters(String name, int age, Address address3)`: Creates a `Person` bean with parameters passed to the method.
- `person4Parameters(String name, int age, Address address3)`: Creates a `Person` bean with parameters passed to the method, and it's annotated as `@Primary`.
- `person5Qualifier(String name, int age, @Qualifier("address2Qualifier") Address address3)`: Creates a `Person` bean with parameters passed to the method, using `@Qualifier` to specify the `Address` bean.

Additionally, the class defines `@Qualifier` annotations and `@Primary` annotations for `Address` beans.

## Handling Matching Beans

The code demonstrates how to handle situations where multiple beans of the same type are available. Qualifiers and the `@Primary` annotation are used to specify which bean should be injected when multiple candidates match a dependency.

In the case of `Person` beans, the `@Primary` annotation is used to indicate the primary candidate. The `person4Parameters` method is annotated with `@Primary`, ensuring it's the default choice when autowiring a `Person` bean.

For `Person` beans that depend on an `Address`, the `@Qualifier` annotation is used to specify which `Address` should be injected. For example, the `person5Qualifier` method specifies `@Qualifier("address2Qualifier")` to ensure that the "address2" bean is used.

## Conclusion

This code demonstrates the usage of Spring Framework to manage and configure beans. It shows how to handle situations where matching beans are available by using qualifiers and the `@Primary` annotation. These techniques provide control over which beans are injected when multiple candidates are present.