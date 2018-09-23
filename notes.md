## Annotations

`@ComponentScan(basePackages = {"<pacakge>",...})`
This will override the default behavior of `@SpringBootApplication` annotation.
So need to add all necessary packages.

`@ImportResource("classpath:<resource name>")`

### Spring Data JPA
`@Entity`

```
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
```


```
@ManyToMany
@JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
```

` @ManyToMany(mappedBy = "authors")`

### DI

`@Qualifier("constructorGreetingService)`
`@Primary`

## H2 database

localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb

## Repository Layer

`public interface BookRepository extends CrudRepository<Book, Long>`

## Bootstrapping DB with mock data

`public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent>`

## Profiles

`@Profile("en")`
`spring.profiles.active=es`
`@Profile({"en", "default"})`

## Thymeleaf

`<html lang="en" xmlns:th="http;//www.thymeleaf.org">`

```
<tbody>
    <tr th:each="owner : ${owners}">
        <td th:text="${owner?.id}">1</td>
        <td th:text="${owner?.firstName}">Panda</td>
        <td th:text="${owner?.lastName}">Karady</td>
    </tr>
</tbody>
```