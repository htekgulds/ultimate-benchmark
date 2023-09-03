# My Ultimate Benchmark

This project aims to compare performance of different programming languages and frameworks for these languages.

The aim is to include a variaty of tasks like database read/write, file operations, API calls, etc. so that every language and framework can show where it shines.

This is a simple and non-exhaustive/non-scientific/non-professional benchamrking project that is mainly for me to learn about other languages and see their weak and strong poitns. Also for anyone else who is equally interested in the same topic.

Any and all contribution is appreciated.

## Database

I used Postgresql and pgadmin for database management.

There is a good sample database [here](https://www.postgresqltutorial.com/postgresql-getting-started/postgresql-sample-database/) which I also used since I didn't want to generate my own. There are tables, functions, views, everything I might need for the benchmark in this sample.

## Tests

I will be using k6 for the load tests. All the tests are inside k6 folder with names corresponding to the titles below.

Every test will be run 3 times and results will be average of that.

### Startup

**Java - Spring Boot (JVM):** 2.80~s

**Java - Spring Boot Reactive (JVM):** 1.60~s

### Films

For this test, I used a films table with 1000 rows from the sample database.

Colunms used:

* film_id: int
* title: varchar(255)
* description: text
* release_year: year
* length: smallint

duration: 30s
users: 1000

#### Results

##### Java - Spring Boot (JVM):

failed requests: 0
successful requests:        28840       29073       28930       avg: 28814
request durations avg:      51.67ms     44.89ms     45.1ms      avg: 47.22ms
request durations min:      6.32ms      6.33ms      6.27ms      avg: 6.30ms
request durations max:      1.38s       988.09ms    764.85ms    avg: 930.31ms
request durations p(95):    81.51ms     79.12ms     152.87ms    avg: 104.5ms


##### Java - Spring Boot Reactive (JVM):

failed requests: 0
successful requests:        6723        5815        5508        avg: 6015
request durations avg:      3.8s        4.64s       5s          avg: 4.48s
request durations min:      739.47ms    55.68ms     92.19ms     avg: 295.78ms
request durations max:      5.57s       6.43s       7.21s       avg: 6.40s
request durations p(95):    4.08s       5.37s       6.18s       avg: 5.21s


