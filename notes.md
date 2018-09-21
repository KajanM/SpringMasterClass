## Annotations

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

## H2 database

localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb

## Repository Layer

`public interface BookRepository extends CrudRepository<Book, Long>`

## Bootstrapping DB with mock data

`public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent>`