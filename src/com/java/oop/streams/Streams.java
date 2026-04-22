package com.java.oop.streams;

import com.java.oop.model.Customer;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) throws IOException {

        CsvReader csvReader = new CsvReader();
        List<Customer> customers = csvReader.getCustomersFromCsv();

        /*
        =========================================
        🔹 INTERMEDIATE OPERATIONS
        =========================================
        */

        // 1. filter()
        System.out.println("Filter (Hyderabad customers):");
        customers.stream()
                .filter(c -> "Hyderabad".equals(c.getCity()))
                .forEach(System.out::println);

        // 2. map()
        System.out.println("\nMap (Emails):");
        customers.stream()
                .map(Customer::getEmail)
                .forEach(System.out::println);

        // 3. sorted()
        System.out.println("\nSorted by Age:");
        customers.stream()
                .sorted(Comparator.comparingInt(Customer::getAge))
                .forEach(System.out::println);

        // 4. distinct()
        System.out.println("\nDistinct Cities:");
        customers.stream()
                .map(Customer::getCity)
                .distinct()
                .forEach(System.out::println);

        // 5. limit()
        System.out.println("\nLimit (First 5):");
        customers.stream()
                .limit(5)
                .forEach(System.out::println);

        // 6. skip()
        System.out.println("\nSkip + Limit:");
        customers.stream()
                .skip(5)
                .limit(5)
                .forEach(System.out::println);

        // 7. peek() (debugging)
        System.out.println("\nPeek:");
        customers.stream()
                .peek(c -> System.out.println("Processing: " + c.getName()))
                .filter(c -> c.getAge() > 25)
                .forEach(System.out::println);

        /*
        =========================================
        🔹 TERMINAL OPERATIONS
        =========================================
        */

        // 8. count()
        long count = customers.stream()
                .filter(c -> c.getAge() > 25)
                .count();
        System.out.println("Count: " + count);

        // 9. anyMatch()
        boolean anyDelhi = customers.stream()
                .anyMatch(c -> "Delhi".equals(c.getCity()));
        System.out.println("Any Delhi: " + anyDelhi);

        // 10. allMatch()
        boolean allAdult = customers.stream()
                .allMatch(c -> c.getAge() > 18);
        System.out.println("All adult: " + allAdult);

        // 11. noneMatch()
        boolean noneTeen = customers.stream()
                .noneMatch(c -> c.getAge() < 18);
        System.out.println("No teens: " + noneTeen);

        // 12. findFirst() + ifPresent
        System.out.println("\nFind First (age > 30):");
        customers.stream()
                .filter(c -> c.getAge() > 30)
                .findFirst()
                .ifPresent(System.out::println);

        // 13. findAny()
        System.out.println("\nFind Any");
        customers.stream()
                .findAny()
                .ifPresent(System.out::println);

        // 14. max() / min()
        System.out.println("\nOldest Customer:");
        customers.stream()
                .max(Comparator.comparingInt(Customer::getAge))
                .ifPresent(System.out::println);

        // 16. collect() → List / Map
        System.out.println("\nCollect (List):");
        List<Customer> list = customers.stream()
                .filter(c -> c.getAge() > 25)
                .toList();

        // 17. groupingBy()
        System.out.println("\nGroup by City:");
        Map<String, List<Customer>> groupByCity =
                customers.stream()
                        .collect(Collectors.groupingBy(Customer::getCity));

        // 18. partitioningBy()
        System.out.println("\nPartition (age > 30):");
        Map<Boolean, List<Customer>> partition =
                customers.stream()
                        .collect(Collectors.partitioningBy(c -> c.getAge() > 30));

        // 19. reduce()
        int totalAge = customers.stream()
                .map(Customer::getAge)
                .reduce(0, Integer::sum);

        System.out.println("Total Age: " + totalAge);

        /*
        =========================================
        🔹 OPTIONAL (VERY IMPORTANT)
        =========================================
        */

        Optional<Customer> optionalCustomer =
                customers.stream().findFirst();

        // ifPresent()
        optionalCustomer.ifPresent(c -> System.out.println(c.getName()));

        // orElse()
        Customer defaultCustomer =
                optionalCustomer.orElse(new Customer());

        // orElseGet()
        Customer lazyCustomer =
                optionalCustomer.orElseGet(Customer::new);

        // orElseThrow()
        Customer mustExist =
                optionalCustomer.orElseThrow(() -> new RuntimeException("No customer found"));

        // map() on Optional
        optionalCustomer
                .map(Customer::getEmail)
                .ifPresent(System.out::println);

        // filter() on Optional
        optionalCustomer
                .filter(c -> c.getAge() > 25)
                .ifPresent(System.out::println);

        /*
        =========================================
        🔹 CHAINING (REAL WORLD)
        =========================================
        */

        System.out.println("\nTop 3 oldest Hyderabad customers:");
        customers.stream()
                .filter(c -> "Hyderabad".equals(c.getCity()))
                .sorted(Comparator.comparingInt(Customer::getAge).reversed())
                .limit(3)
                .map(Customer::getName)
                .forEach(System.out::println);
    }
}