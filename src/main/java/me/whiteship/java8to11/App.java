package me.whiteship.java8to11;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        int size = 1500;
//        int[] numbers = new int[size];
//        Random random = new Random();
//
//        IntStream.range(0, size).forEach(i -> numbers[i] = random.nextInt());
//        long start = System.nanoTime();
//        Arrays.sort(numbers);
//        System.out.println("serial sorting took " + (System.nanoTime() - start));
//
//        IntStream.range(0, size).forEach(i -> numbers[i] = random.nextInt());
//        start = System.nanoTime();
//        Arrays.parallelSort(numbers);
//        System.out.println("parallel sorting took " + (System.nanoTime() - start));

/*        5. 메소드 레퍼런스
        람다가 하는 일이 기존 메소드 또는 생성자를 호출하는 거라면, 메소드 레퍼런스를 사용해서
        매우 간결하게 표현할 수 있다.

        메소드 참조하는 방법
        스태틱 메소드 참조 | 타입::스태틱 메소드
        특정 객체의 인스턴스 메소드 참조  | 객체 레퍼런스::인스턴스 메소드
        임의 객체의 인스턴스 메소드 참조  | 타입::인스턴스 메소드
        생성자 참조  | 타입::new

        ● 메소드 또는 생성자의 매개변수로 람다의 입력값을 받는다.
        ● 리턴값 또는 생성한 객체는 람다의 리턴값이다.*/

//        Function<Integer, String> intToString = (i) -> "number";
//        UnaryOperator<String> hi = Greeting::hi;
//        Greeting greeting = new Greeting();
//        UnaryOperator<String> hello = greeting::hello;
//        System.out.println(hello.apply("java8"));
//        Supplier<Greeting> newGreeting = Greeting::new;

//        Function<String, Greeting> java8Greeting = Greeting::new;
//        Greeting java8 = java8Greeting.apply("java8");
//        System.out.println(java8.getName());
//        Supplier<Greeting> newGreeting = Greeting::new;

//        //람다 예시2
//        String[] names = {"name1", "name2", "name3"};
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });

//        //람다 예시2
//        String[] names = {"name1", "name2", "name3"};
//        Arrays.sort(names, (o1, o2) -> 0);
//        Arrays.sort(names, String::compareToIgnoreCase);
//        System.out.println(Arrays.toString(names));

/*        6. 인터페이스 기본 메소드와 스태틱 메소드
        기본 메소드 (Default Methods)
        ● 인터페이스에 메소드 선언이 아니라 구현체를 제공하는 방법
        ● 해당 인터페이스를 구현한 클래스를 깨트리지 않고 새 기능을 추가할 수 있다.
        ● 기본 메소드는 구현체가 모르게 추가된 기능으로 그만큼 리스크가 있다.
            ○ 컴파일 에러는 아니지만 구현체에 따라 런타임 에러가 발생할 수 있다.
            ○ 반드시 문서화 할 것. (@implSpec 자바독 태그 사용)
        ● Object가 제공하는 기능 (equals, hasCode)는 기본 메소드로 제공할 수 없다.
            ○ 구현체가 재정의해야 한다.
        ● 본인이 수정할 수 있는 인터페이스에만 기본 메소드를 제공할 수 있다.
        ● 인터페이스를 상속받는 인터페이스에서 다시 추상 메소드로 변경할 수 있다.
        ● 인터페이스 구현체가 재정의 할 수도 있다.

        스태틱 메소드
        ● 해당 타입 관련 헬터 또는 유틸리티 메소드를 제공할 때 인터페이스에 스태틱 메소드를 제공할 수 있다.*/

//        //인터페이스
//        Foo foo = new DefaultFoo("java8");
//        foo.printName();
//        foo.printNameUpperCase();
//
//        Foo.printAnything();

/*        Iterable의 기본 메소드
        ● forEach()
        ● spliterator()

        Collection의 기본 메소드
        ● stream() / parallelStream()
        ● removeIf(Predicate)
        ● spliterator()

        Comparator의 기본 메소드 및 스태틱 메소드
        ● reversed()
        ● thenComparing()
        ● static reverseOrder() / naturalOrder()
        ● static nullsFirst() / nullsLast()
        ● static comparing()*/

//        List<String> name = new ArrayList<>();
//        name.add("java8");
//        name.add("whiteship");
//        name.add("toby");
//        name.add("foo");

//        name.forEach(s -> {
//            System.out.println(s);
//        });
//        //위의 코드 줄여서 사용 가능
//        name.forEach(s -> System.out.println(s));
//        name.forEach(System.out::println);
//
//        for(String n : name){
//            System.out.println(n);
//        }

//        // 순서는 섞을수있다.
//        Spliterator<String> spliterator = name.spliterator();
//        Spliterator<String> spliterator1 = spliterator.trySplit();
//        while (spliterator.tryAdvance(System.out::println)); //soutc 단축키
//        System.out.println("============");
//        while (spliterator1.tryAdvance(System.out::println)); //soutc 단축키

////        name.stream();
////        long k = name.stream().map(String::toUpperCase)
//        name.stream().map(String::toUpperCase)
//                .filter(s -> s.startsWith("J"))
//                .collect(Collectors.toSet());
////                .count();
////        System.out.println(k);

//        name.removeIf(s -> s.startsWith("j"));
//        name.forEach(System.out::println);

////        name.sort(String::compareToIgnoreCase);
//        Comparator<String> comparatorToIgnoreCase = String::compareToIgnoreCase;
////        name.sort(comparatorToIgnoreCase.reversed());
//        name.sort(comparatorToIgnoreCase.reversed().thenComparing());
//        name.forEach(System.out::println);

/*        8. Stream 소개
        Stream
        ● sequence of elements supporting sequential and parallel aggregate operations
        ● 데이터를 담고 있는 저장소 (컬렉션)이 아니다.
        ● Funtional in nature, 스트림이 처리하는 데이터 소스를 변경하지 않는다.
        ● 스트림으로 처리하는 데이터는 오직 한번만 처리한다.
        ● 무제한일 수도 있다. (Short Circuit 메소드를 사용해서 제한할 수 있다.)
        ● 중개 오퍼레이션은 근본적으로 lazy 하다.
        ● 손쉽게 병렬 처리할 수 있다.

        스트림 파이프라인
        ● 0 또는 다수의 중개 오퍼레이션 (intermediate operation)과 한개의 종료 오퍼레이션 (terminal operation)으로 구성한다.
        ● 스트림의 데이터 소스는 오직 터미널 오퍼네이션을 실행할 때에만 처리한다.

        중개 오퍼레이션
        ● Stream을 리턴한다.
        ● Stateless / Stateful 오퍼레이션으로 더 상세하게 구분할 수도 있다. (대부분은 Stateless지만 distinct나 sorted 처럼 이전 이전 소스 데이터를 참조해야 하는 오퍼레이션은 Stateful 오퍼레이션이다.)
        ● filter, map, limit, skip, sorted, ...

        종료 오퍼레이션
        ● Stream을 리턴하지 않는다.
        ● collect, allMatch, count, forEach, min, max, ...*/

//        List<String> names = new ArrayList<>();
//        names.add("java8");
//        names.add("whiteship");
//        names.add("toby");
//        names.add("foo");

//////        names.stream().map(String::toUpperCase);
//////        Stream<String> stringStream = names.stream().map(String::toUpperCase);
//////        names.forEach(System.out::println);
////        names.stream().map((s) -> {
////            System.out.println(s);
////            return s.toUpperCase();
////        });
//        List<String> collect = names.stream().map((s) -> {
//            System.out.println(s);
//            return s.toUpperCase();
//        }).collect(Collectors.toList());
//        collect.forEach(System.out::println);
//
//        System.out.println("============");
//
//        names.forEach(System.out::println);

//        for(String name : names){
//            if(name.startsWith("j")){
//                System.out.println(name.toUpperCase();
//            }
//        }

//        List<String> collect = names.parallelStream().map(String::toUpperCase)
//                .collect(Collectors.toList());
//        collect.forEach(System.out::println);

//        //병렬처리
//        List<String> collect = names.parallelStream().map((s) -> {
//            System.out.println(s + " " + Thread.currentThread().getName());
//            return s.toUpperCase();
//        }).collect(Collectors.toList());
//        collect.forEach(System.out::println);

//        //직렬처리
//        List<String> collect = names.stream().map((s) -> {
//            System.out.println(s + " " + Thread.currentThread().getName());
//            return s.toUpperCase();
//        }).collect(Collectors.toList());
//        collect.forEach(System.out::println);

/*        9. Stream API

        걸러내기
        ● Filter(Predicate)
        ● 예) 이름이 3글자 이상인 데이터만 새로운 스트림으로

        변경하기
        ● Map(Function) 또는 FlatMap(Function)
        ● 예) 각각의 Post 인스턴스에서 String title만 새로운 스트림으로
        ● 예) List<Stream<String>>을 String의 스트림으로

        생성하기
        ● generate(Supplier) 또는 Iterate(T seed, UnaryOperator)
        ● 예) 10부터 1씩 증가하는 무제한 숫자 스트림
        ● 예) 랜덤 int 무제한 스트림

        제한하기
        ● limit(long) 또는 skip(long)
        ● 예) 최대 5개의 요소가 담긴 스트림을 리턴한다.
        ● 예) 앞에서 3개를 뺀 나머지 스트림을 리턴한다.

        스트림에 있는 데이터가 특정 조건을 만족하는지 확인
        ● anyMatch(), allMatch(), nonMatch()
        ● 예) k로 시작하는 문자열이 있는지 확인한다. (true 또는 false를 리턴한다.)
        ● 예) 스트림에 있는 모든 값이 10보다 작은지 확인한다.

        개수 세기
        ● count()
        ● 예) 10보다 큰 수의 개수를 센다.

        스트림을 데이터 하나로 뭉치기
        ● reduce(identity, BiFunction), collect(), sum(), max()
        ● 예) 모든 숫자 합 구하기
        ● 예) 모든 데이터를 하나의 List 또는 Set에 옮겨 담기*/

//        List<OnlineClass> springClasses = new ArrayList<>();
//        springClasses.add(new OnlineClass(1, "spring boot", true));
//        springClasses.add(new OnlineClass(2, "spring data jpa", true));
//        springClasses.add(new OnlineClass(3, "spring mvc", false));
//        springClasses.add(new OnlineClass(4, "spring core", false));
//        springClasses.add(new OnlineClass(5, "rest api development", false));
//
//        List<OnlineClass> javaClasses = new ArrayList<>();
//        javaClasses.add(new OnlineClass(6, "the java, Test", true));
//        javaClasses.add(new OnlineClass(7, "the java, Code manipulation", true));
//        javaClasses.add(new OnlineClass(8, "the java, 8 to 11", false));
//
//        List<List<OnlineClass>> keesunEvents = new ArrayList<>();
//        keesunEvents.add(javaClasses);
//
//        System.out.println("spring 으로 시작하는 수업");
//        springClasses.stream()
//                .filter(oc -> oc.getTitle().startsWith("spring"))
//                .forEach(oc -> System.out.println(oc.getId()));
//
//        System.out.println("close 되지 않는 수업");
//        springClasses.stream()
////                .filter(oc -> !oc.isClosed())
//                .filter(Predicate.not(OnlineClass::isClosed)) //! 대신 Predicate.not
//                .forEach(oc -> System.out.println(oc.getId()));
//
//        System.out.println("수업 이름만 모 으로 시작하는 수업");
//        springClasses.stream()
////                .map(oc -> oc.getTitle())
////                .forEach(s -> System.out.println(s));
//                .map(OnlineClass::getTitle) //레퍼런스로 변경 가능
//                .forEach(System.out::println);
//
//        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
//        keesunEvents.stream()
//                .flatMap(Collection::stream)
//                .forEach(oc -> System.out.println(oc.getId()));
//
//        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");
//        Stream.iterate(10, i ->  i + 1)
//                .skip(10)
//                .limit(10)
//                .forEach(System.out::println);
//
//        System.out.println("자바 수업 중에 Test가 들어있는 수입이 있는지 확인");
//        boolean test = javaClasses.stream().anyMatch(oc -> oc.getTitle().contains("Test"));
//        System.out.println(test);
//
//        System.out.println("스프링 수업 중에 제목에 spring 들어간 제목만 모아서 List로 만들기");
////        List<String> spring = springClasses.stream()
////                .filter(oc -> oc.getTitle().contains("spring"))
////                .map(OnlineClass::getTitle)
////                .collect(Collectors.toList());
////        spring.forEach(System.out::println);
//        List<String> spring = springClasses.stream()
//                .map(OnlineClass::getTitle)
//                .filter(t -> t.contains("spring"))
//                .collect(Collectors.toList());
//        spring.forEach(System.out::println);



/*        10. Optional 소개

        자바 프로그래밍에서 NullPointerException을 종종 보게 되는 이유
        ● null을 리턴하니까! && null 체크를 깜빡했으니까!

        메소드에서 작업 중 특별한 상황에서 값을 제대로 리턴할 수 없는 경우 선택할 수 있는 방법
        ● 예외를 던진다. (비싸다, 스택트레이스를 찍어두니까.)
        ● null을 리턴한다. (비용 문제가 없지만 그 코드를 사용하는 클리어인트 코드가 주의해야 한다.)
        ● (자바 8부터) Optional을 리턴한다. (클라이언트에 코드에게 명시적으로 빈 값일 수도 있다는 걸 알려주고, 빈 값인 경우에 대한 처리를 강제한다.)

        Optional
        ● 오직 값 한 개가 들어있을 수도 없을 수도 있는 컨네이너.

        주의할 것
        ● 리턴값으로만 쓰기를 권장한다. (메소드 매개변수 타입, 맵의 키 타입, 인스턴스 필드 타입으로 쓰지 말자.)
        ● Optional을 리턴하는 메소드에서 null을 리턴하지 말자.
        ● 프리미티브 타입용 Optional을 따로 있다. OptionalInt, OptionalLong,...
        ● Collection, Map, Stream Array, Optional은 Opiontal로 감싸지 말 것.*/


//        List<OnlineClass> springClasses = new ArrayList<>();
//        springClasses.add(new OnlineClass(1, "spring boot", true));
//        springClasses.add(new OnlineClass(2, "spring data jpa", true));
//        springClasses.add(new OnlineClass(3, "spring mvc", false));
//        springClasses.add(new OnlineClass(4, "spring core", false));
//        springClasses.add(new OnlineClass(5, "rest api development", false));
//
//        OnlineClass spring_boot = new OnlineClass(1, "spring boot", true);
//        Duration studyDuration = spring_boot.getProgress().getStudyDuration();
//        System.out.println(studyDuration);

//        Progress progress = spring_boot.getProgress();
//        if(progress != null){
//            System.out.println(progress.getStudyDuration());
//        }

//        //map에도 옵셔널 쓰지 말것
//        spring_boot.setProgress(null);

//        Optional.of(10); //박싱 언박싱 많이 발생해서 쓰지말것
//        OptionalInt.of(10);


/*        11. Optional API

        Optional 만들기
        ● Optional.of()
        ● Optional.ofNullable()
        ● Optional.empty()

        Optional에 값이 있는지 없는지 확인하기
        ● isPresent()
        ● isEmpty() (Java 11부터 제공)

        Optional에 있는 값 가져오기
        ● get()
        ● 만약에 비어있는 Optional에서 무언가를 꺼낸다면??

        Optional에 값이 있는 경우에 그 값을 가지고 ~~를 하라.
        ● ifPresent(Consumer)
        ● 예) Spring으로 시작하는 수업이 있으면 id를 출력하라.

        Optional에 값이 있으면 가져오고 없는 경우에 ~~를 리턴하라.
        ● orElse(T)
        ● 예) JPA로 시작하는 수업이 없다면 비어있는 수업을 리턴하라.

        Optional에 값이 있으면 가져오고 없는 경우에 ~~를 하라.
        ● orElseGet(Supplier)
        ● 예) JPA로 시작하는 수업이 없다면 새로 만들어서 리턴하라.

        Optional에 값이 있으면 가졍고 없는 경우 에러를 던져라.
        ● orElseThrow()

        Optional에 들어있는 값 걸러내기
        ● Optional filter(Predicate)

        Optional에 들어있는 값 변환하기
        ● Optional map(Function)
        ● Optional flatMap(Function): Optional 안에 들어있는 인스턴스가 Optional인 경우에 사용하면 편리하다.*/

//        List<OnlineClass> springClasses = new ArrayList<>();
//        springClasses.add(new OnlineClass(1, "spring boot", true));
//        springClasses.add(new OnlineClass(5, "rest api development", false));

//        Optional<OnlineClass> spring = springClasses.stream()
//                .filter(oc -> oc.getTitle().startsWith("spring"))
//                .findFirst();

//        spring.isPresent();
//        boolean present = spring.isPresent();
//        System.out.println(present);

//        Optional<OnlineClass> onlineClass = springClasses.stream()
//                .filter(oc -> oc.getTitle().startsWith("jpa"))
//                .findFirst();

////        boolean present = onlineClass.isPresent();
//        boolean present = onlineClass.isEmpty();
//        System.out.println(present);
//        System.out.println(!present);

//        Optional<OnlineClass> optional = springClasses.stream()
////                .filter(oc -> oc.getTitle().startsWith("spring"))
//                .filter(oc -> oc.getTitle().startsWith("jpa"))
//                .findFirst();
//
////        if(optional.isPresent()){
////            OnlineClass onlineClass = optional.get();
////            System.out.println(onlineClass);
////        }
//
////        optional.ifPresent(oc -> {
////            System.out.println(oc.getTitle());
////        });
//        optional.ifPresent(oc -> System.out.println(oc.getTitle()));

//        Optional<OnlineClass> optional = springClasses.stream()
//                .filter(oc -> oc.getTitle().startsWith("jpa"))
//                .findFirst();

//        OnlineClass onlineClass = optional.orElse(createNewClass());
//        System.out.println(onlineClass.getTitle());
//        OnlineClass onlineClass = optional.orElseGet(App::createNewClass);
//        OnlineClass onlineClass = optional.orElseThrow(() -> {
//            return new IllegalArgumentException();
//        });
//        OnlineClass onlineClass = optional.orElseThrow(IllegalArgumentException::new);
//        System.out.println(onlineClass.getTitle());
//        Optional<OnlineClass> onlineClass = optional.filter(oc -> oc.isClosed());
//        System.out.println(onlineClass.isEmpty());
//        System.out.println(onlineClass.isPresent());
//        Optional<OnlineClass> onlineClass = optional.filter(OnlineClass::isClosed);
//        optional.map(oc -> oc.getId());
//        Optional<Integer> integer = optional.map(OnlineClass::getId);
//        System.out.println(integer.isPresent());
//        optional.map(OnlineClass::getProgress);
//        Optional<Optional<Progress>> progress = optional.map(OnlineClass::getProgress);
//        Optional<Progress> progress1 = progress.orElseThrow();
//        progress1.orElseThrow();

//        Optional<Progress> progress = optional.flatMap(OnlineClass::getProgress);
//        Optional<Optional<Progress>> progress1 = optional.map(OnlineClass::getProgress);
//        Optional<Progress> progress2 = progress1.orElseThrow();

/*        12. Date와 Time API 소개

        자바 8에 새로운 날짜와 시간 API가 생긴 이유
        ● 그전까지 사용하던 java.util.Date 클래스는 mutable 하기 때문에 thead safe하지 않다.
        ● 클래스 이름이 명확하지 않다. Date인데 시간까지 다룬다.
        ● 버그 발생할 여지가 많다. (타입 안정성이 없고, 월이 0부터 시작한다거나..)
        ● 날짜 시간 처리가 복잡한 애플리케이션에서는 보통 Joda Time을 쓰곤했다.

        자바 8에서 제공하는 Date-Time API
        ● JSR-310 스팩의 구현체를 제공한다.
        ● 디자인 철학
            ○ Clear
            ○ Fluent
            ○ Immutable
            ○ Extensible

        주요 API
        ● 기계용 시간 (machine time)과 인류용 시간(human time)으로 나눌 수 있다.
        ● 기계용 시간은 EPOCK (1970년 1월 1일 0시 0분 0초)부터 현재까지의 타임스탬프를 표현한다.
        ● 인류용 시간은 우리가 흔히 사용하는 연,월,일,시,분,초 등을 표현한다.
        ● 타임스탬프는 Instant를 사용한다.
        ● 특정 날짜(LocalDate), 시간(LocalTime), 일시(LocalDateTime)를 사용할 수 있다.
        ● 기간을 표현할 때는 Duration (시간 기반)과 Period (날짜 기반)를 사용할 수 있다.
        ● DateTimeFormatter를 사용해서 일시를 특정한 문자열로 포매팅할 수 있다.*/

//        //java8 이전 코드 - 안전하기 쓰기 어렵다.
//        Date date = new Date();
//        long time = date.getTime();
////        Calendar calendar = new GregorianCalendar();
////        //java.text.SimpleDateFormat
////        SimpleDateFormat dateFormat = new SimpleDateFormat();
//        System.out.println(date);
//        System.out.println(time);
//
//        Thread.sleep(1000*3);
//        Date after3Seconds = new Date();
//        System.out.println(after3Seconds);
//        after3Seconds.setTime(time);
//        System.out.println(after3Seconds);

//        //버그 발생
//        Calendar keesunBirthDay = new GregorianCalendar(1982, Calendar.AUGUST, 15);
//        System.out.println(keesunBirthDay.getTime());
//        keesunBirthDay.add(Calendar.DAY_OF_YEAR,1);
//        System.out.println(keesunBirthDay.getTime());
//        //java.time.chrono.//다양한 달력 시스템

//        //기계용 시간
//        Date date = new Date();
//        long time = date.getTime();
//        System.out.println(time);

/*        13. Date와 Time API

        지금 이 순간을 기계 시간으로 표현하는 방법
        ● Instant.now(): 현재 UTC (GMT)를 리턴한다.
        ● Universal Time Coordinated == Greenwich Mean Time
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.atZone(ZoneId.of("UTC")));
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

        인류용 일시를 표현하는 방법
        ● LocalDateTime.now(): 현재 시스템 Zone에 해당하는(로컬) 일시를 리턴한다.
        ● LocalDateTime.of(int, Month, int, int, int, int): 로컬의 특정 일시를 리턴한다.
        ● ZonedDateTime.of(int, Month, int, int, int, int, ZoneId): 특정 Zone의 특정 일시를  리턴한다.

        기간을 표현하는 방법
        ● Period / Duration . beteen()
        Period between = Period.between(today, birthDay);
        System.out.println(between.get(ChronoUnit.DAYS));

        파싱 또는 포매팅
        ● 미리 정의해둔 포맷 참고
        https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#predefined
        ● LocalDateTime.parse(String, DateTimeFormatter);
        ● Dateteme
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MM/d/yyyy");
        LocalDate date = LocalDate.parse("07/15/1982", formatter);
        System.out.println(date);
        System.out.println(today.format(formatter));

        레거시 API 지원
        ● GregorianCalendar와 Date 타입의 인스턴스를 Instant나 ZonedDateTime으로 변환 가능.
        ● java.util.TimeZone에서 java.time.ZoneId로 상호 변환 가능.
        ZoneId newZoneAPI = TimeZone.getTimeZone("PST").toZoneId();
        TimeZone legacyZoneAPI = TimeZone.getTimeZone(newZoneAPI);
        Instant newInstant = new Date().toInstant();
        Date legacyInstant = Date.from(newInstant);*/

//        Instant instant = Instant.now();
//        System.out.println(instant); //기준시 UTC GMT
//        System.out.println(instant.atZone(ZoneId.of("UTC"))); //기준시 UTC GMT
//        ZoneId zone = ZoneId.systemDefault();
//        System.out.println(zone);
//        ZonedDateTime zonedDateTime = instant.atZone(zone);
//        System.out.println(zonedDateTime);

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//        LocalDateTime birthDay = LocalDateTime.of(1982,15,0,0,0);
//        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
//        System.out.println(nowInKorea);
//
//        Instant nowInstant = Instant.now();
//        ZonedDateTime zonedDateTime = nowInstant.atZone(ZoneId.of("Asia/Seoul"));
//        System.out.println(zonedDateTime);

//        //기간을 비교
//        LocalDate today = LocalDate.now();
//        LocalDate thisYearBirthday = LocalDate.of(2020, Month.JULY, 15);
//
//        Period period = Period.between(today, thisYearBirthday);
//        System.out.println(period.get(ChronoUnit.DAYS));
//        Period until = today.until(thisYearBirthday);
//        System.out.println(until.get(ChronoUnit.DAYS));

//        //머신용 시간 비교
//        Instant now = Instant.now();
//        Instant plus = now.plus(10, ChronoUnit.SECONDS);
//        Duration between = Duration.between(now, plus);
//        System.out.println(between.getSeconds());

//        //format
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//        System.out.println(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
//        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        System.out.println(now.format(MMddyyyy));

//        //parse
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        System.out.println(now.format(MMddyyyy));
//
//        LocalDate parse = LocalDate.parse("07/15/1982", MMddyyyy);
//        System.out.println(parse);
//
//        Date date = new Date();
//        Instant instant = date.toInstant();
//        Date newDate = Date.from(instant);
//
//        GregorianCalendar gregorianCalendar = new GregorianCalendar();
////        LocalDateTime dateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
//        ZonedDateTime dateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault());
//        GregorianCalendar from = GregorianCalendar.from(dateTime);
//
//        ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId();
////        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
//        now.plus(10, ChronoUnit.DAYS);

/*        14. 자바 Concurrent 프로그래밍 소개

        Concurrent 소프트웨어
        ● 동시에 여러 작업을 할 수 있는 소프트웨어
        ● 예) 웹 브라우저로 유튜브를 보면서 키보드로 문서에 타이핑을 할 수 있다.
        ● 예) 녹화를 하면서 인텔리J로 코딩을 하고 워드에 적어둔 문서를 보거나 수정할 수 있다.

        자바에서 지원하는 컨커런트 프로그래밍
        ● 멀티프로세싱 (ProcessBuilder)
        ● 멀티쓰레드

        자바 멀티쓰레드 프로그래밍
        ● Thread / Runnable

        Thread 상속
        public static void main(String[] args) {
            HelloThread helloThread = new HelloThread();
            helloThread.start();
            System.out.println("hello : " + Thread.currentThread().getName());
        }
        static class HelloThread extends Thread {
            @Override
            public void run() {
                System.out.println("world : " + Thread.currentThread().getName());
            }
        }

        Runnable 구현 또는 람다
        Thread thread = new Thread(() -> System.out.println("world : " + Thread.currentThread().getName()));
        thread.start();
        System.out.println("hello : " + Thread.currentThread().getName());

        쓰레드 주요 기능
        ● 현재 쓰레드 멈춰두기 (sleep): 다른 쓰레드가 처리할 수 있도록 기회를 주지만 그렇다고 락을 놔주진 않는다. (잘못하면 데드락 걸릴 수 있겠죠.)
        ● 다른 쓰레드 깨우기 (interupt): 다른 쓰레드를 깨워서 interruptedExeption을 발생 시킨다. 그 에러가 발생했을 때 할 일은 코딩하기 나름. 종료 시킬 수도 있고 계속 하던 일 할 수도 있고.
        ● 다른 쓰레드 기다리기 (join): 다른 쓰레드가 끝날 때까지 기다린다.*/

//        System.out.println(Thread.currentThread().getName());

//        // 쓰레드 순서 보장 못함
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("Hello");

////        //람다로 바꾸기 전
////        Thread thread = new Thread(new Runnable() {
////            @Override
////            public void run() {
////                System.out.println("Thread: " + Thread.currentThread().getName());
////            }
////        });
//        //람다로 바꾼 후
//        Thread thread = new Thread(() -> {
//            try {
//                Thread.sleep(1000L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Thread: " + Thread.currentThread().getName());
//        });
//        thread.start();
//        System.out.println("Hello: " + Thread.currentThread().getName());

//        Thread thread = new Thread(() -> {
//            while(true){
//                System.out.println("Thread: " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(1000L);
//                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                    throw new IllegalStateException(e);
//                    System.out.println("interrupted");
//                    return;
//                }
//            }
//        });
//        thread.start();
//        System.out.println("Hello: " + Thread.currentThread().getName());
//        Thread.sleep(3000L);
//        thread.interrupt();

//        Thread thread = new Thread(() -> {
//            while(true){
//                System.out.println("Thread: " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(3000L);
//                } catch (InterruptedException e) {
//                    throw new IllegalStateException();
//                }
//            }
//        });
//        thread.start();
//        System.out.println("Hello: " + Thread.currentThread().getName());
//        try {
//            thread.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        thread.join();
//        System.out.println(thread + "is finished");

/*        15. Executors

        고수준 (High-Level) Concurrency 프로그래밍
        ● 쓰레드를 만들고 관리하는 작업을 애플리케이션에서 분리.
        ● 그런 기능을 Executors에게 위임.

        Executors가 하는 일
        ● 쓰레드 만들기: 애플리케이션이 사용할 쓰레드 풀을 만들어 관리한다.
        ● 쓰레드 관리: 쓰레드 생명 주기를 관리한다.
        ● 작업 처리 및 실행: 쓰레드로 실행할 작업을 제공할 수 있는 API를 제공한다.

        주요 인터페이스
        ● Executor: execute(Runnable)
        ● ExecutorService: Executor 상속 받은 인터페이스로, Callable도 실행할 수 있으며, Executor를 종료 시키거나, 여러 Callable을 동시에 실행하는 등의 기능을 제공한다.
        ● ScheduledExecutorService: ExecutorService를 상속 받은 인터페이스로 특정 시간

        이후에 또는 주기적으로 작업을 실행할 수 있다.
        ExecutorService로 작업 실행하기
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            System.out.println("Hello :" + Thread.currentThread().getName());
        });

        ExecutorService로 멈추기
        executorService.shutdown(); // 처리중인 작업 기다렸다가 종료
        executorService.shutdownNow(); // 당장 종료

        Fork/Join 프레임워크
        ● ExecutorService의 구현체로 손쉽게 멀티 프로세서를 활용할 수 있게끔 도와준다.*/

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
////        //래퍼런스 하기전
////        executorService.submit(new Runnable() {
////            @Override
////            public void run() {
////                System.out.println("Thread " + Thread.currentThread().getName());
////            }
////        });
//        //래퍼런스 한 후
//        executorService.submit(() -> System.out.println("Thread " + Thread.currentThread().getName()));
////        //계속돌기 때문에 꼭 shotdown 해야함 - graceful shutdown
////        executorService.shutdown();
//        executorService.shutdownNow();

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        executorService.submit(getRunnable("Hello"));
//        executorService.submit(getRunnable("the"));
//        executorService.submit(getRunnable("Jave"));
//        executorService.submit(getRunnable("8"));
//        executorService.submit(getRunnable("Thread"));
//        executorService.shutdown();

//        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
////        executorService.schedule(getRunnable("Hello"), 3, TimeUnit.SECONDS);
//        executorService.scheduleAtFixedRate(getRunnable("Hello"), 1, 2, TimeUnit.SECONDS);

/*        16. Callable과 Future

        Callable
        ● Runnable과 유사하지만 작업의 결과를 받을 수 있다.

        Future
        ● 비동기적인 작업의 현재 상태를 조회하거나 결과를 가져올 수 있다.
        ● https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html

        결과를 가져오기 get()
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> helloFuture = executorService.submit(() -> {
        Thread.sleep(2000L);
        return "Callable";
        });
        System.out.println("Hello");
        String result = helloFuture.get();
        System.out.println(result);
        executorService.shutdown();
        ● 블록킹 콜이다.
        ● 타임아웃(최대한으로 기다릴 시간)을 설정할 수 있다.

        작업 상태 확인하기 isDone()
        ● 완료 했으면 true 아니면 false를 리턴한다.

        작업 취소하기 cancel()
        ● 취소 했으면 true 못했으면 false를 리턴한다.
        ● parameter로 true를 전달하면 현재 진행중인 쓰레드를 interrupt하고 그러지 않으면 현재 진행중인 작업이 끝날때까지 기다린다.

        여러 작업 동시에 실행하기 invokeAll()
        ● 동시에 실행한 작업 중에 제일 오래 걸리는 작업 만큼 시간이 걸린다.

        여러 작업 중에 하나라도 먼저 응답이 오면 끝내기 invokeAny()
        ● 동시에 실행한 작업 중에 제일 짧게 걸리는 작업 만큼 시간이 걸린다.
        ● 블록킹 콜이다.*/

//        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
////        //래퍼런스 생성전
////        Callable <String> hello = new Callable<String>() {
////            @Override
////            public String call() throws Exception {
////                return null;
////            }
////        };
//        Callable <String> hello = () -> {
//            Thread.sleep(2000L);
//            return  "Hello";
//        };
//
//        Future<String> submit = executorService.submit(hello);
//        System.out.println("Started");
//        submit.get();//블록킹
//        System.out.println("End!!!!");
//        executorService.shutdown();

//        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
//        Callable <String> hello = () -> {
//            Thread.sleep(2000L);
//            return  "Hello";
//        };
//        Future<String> helloFuture = executorService.submit(hello);
//        System.out.println(helloFuture.isDone());
//        System.out.println("Started");
//        helloFuture.cancel(false);
//        System.out.println(helloFuture.isDone());
//        System.out.println("End!!!!");
//        executorService.shutdown();

//        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
//        Callable <String> hello = () -> {
//            Thread.sleep(2000L);
//            return  "Hello";
//        };
//        Callable <String> java = () -> {
//            Thread.sleep(3000L);
//            return  "java";
//        };
//        Callable <String> keesun = () -> {
//            Thread.sleep(1000L);
//            return  "keesun";
//        };
////        executorService.invokeAll(Arrays.asList());
//        List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello, java, keesun));
//        for(Future<String> f : futures){
//            System.out.println(f.get());
//        }
//        executorService.shutdown();

/*        17. CompletableFuture 1

        자바에서 비동기(Asynchronous) 프로그래밍을 가능케하는 인터페이스.
        ● Future를 사용해서도 어느정도 가능했지만 하기 힘들 일들이 많았다.

        Future로는 하기 어렵던 작업들
        ● Future를 외부에서 완료 시킬 수 없다. 취소하거나, get()에 타임아웃을 설정할 수는 있다.
        ● 블로킹 코드(get())를 사용하지 않고서는 작업이 끝났을 때 콜백을 실행할 수 없다.
        ● 여러 Future를 조합할 수 없다, 예) Event 정보 가져온 다음 Event에 참석하는 회원 목록 가져오기
        ● 예외 처리용 API를 제공하지 않는다.

        CompletableFuture
        ● Implements Future
        ● Implements CompletionStage

        비동기로 작업 실행하기
        ● 리턴값이 없는 경우: runAsync()
        ● 리턴값이 있는 경우: supplyAsync()
        ● 원하는 Executor(쓰레드풀)를 사용해서 실행할 수도 있다. (기본은 ForkJoinPool.commonPool())

        콜백 제공하기
        ● thenApply(Function): 리턴값을 받아서 다른 값으로 바꾸는 콜백
        ● thenAccept(Consumer): 리턴값을 또 다른 작업을 처리하는 콜백 (리턴없이)
        ● thenRun(Runnable): 리턴값 받지 다른 작업을 처리하는 콜백
        ● 콜백 자체를 또 다른 쓰레드에서 실행할 수 있다.*/

//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        Future<String> future = executorService.submit(() -> "hello");
//        future.get();

//        CompletableFuture<String> future = new CompletableFuture<>();
//        future.complete("java");
//        System.out.println(future.get());

//        CompletableFuture<String> future = CompletableFuture.completedFuture("java");
//        System.out.println(future.get());

//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
//            System.out.println("java" + Thread.currentThread().getName());
//        });

//        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
//            System.out.println("java" + Thread.currentThread().getName());
//        });
//        future.get();

//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("java" + Thread.currentThread().getName());
//            return "Hello";
//        });
//        System.out.println(future.get());

//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("java" + Thread.currentThread().getName());
//            return "Hello";
//        }).thenApply((s) -> {
//            System.out.println(Thread.currentThread().getName());
//            return  s.toUpperCase();
//        });

//        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("java" + Thread.currentThread().getName());
//            return "Hello";
//        }).thenAccept((s) -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(s.toUpperCase());
//        });
//        future.get();

//        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("java" + Thread.currentThread().getName());
//            return "Hello";
//        }).thenRun((s) -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//        future.get();

/*        18. CompletableFuture 2

        조합하기
        ● thenCompose(): 두 작업이 서로 이어서 실행하도록 조합
        ● thenCombine(): 두 작업을 독립적으로 실행하고 둘 다 종료 했을 때 콜백 실행
        ● allOf(): 여러 작업을 모두 실행하고 모든 작업 결과에 콜백 실행
        ● anyOf(): 여러 작업 중에 가장 빨리 끝난 하나의 결과에 콜백 실행

        예외처리
        ● exeptionally(Function)
        ● handle(BiFunction):*/

//        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Hello" + Thread.currentThread().getName());
//            return "Hello";
//        });
//        CompletableFuture<String> future = hello.thenCompose(App::getWorld);
//        System.out.println(future.get());

//        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Hello" + Thread.currentThread().getName());
//            return "Hello";
//        });
//        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
//            System.out.println("World" + Thread.currentThread().getName());
//            return "World";
//        });
//        CompletableFuture<String> future = hello.thenCombine(world, (h, w) -> h + "" + w);
//        System.out.println(future.get());

//        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Hello" + Thread.currentThread().getName());
//            return "Hello";
//        });
//        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
//            System.out.println("World" + Thread.currentThread().getName());
//            return "World";
//        });
//        CompletableFuture<Void> future = CompletableFuture.allOf(hello, world)
//                .thenAccept(System.out::println);
//        System.out.println(future.get());

//        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Hello" + Thread.currentThread().getName());
//            return "Hello";
//        });
//        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
//            System.out.println("World" + Thread.currentThread().getName());
//            return "World";
//        });
//        List<CompletableFuture<String>> futures = Arrays.asList(hello, world);
//        CompletableFuture[] futuresArray = futures.toArray(new CompletableFuture[futures.size()]);
//        CompletableFuture<List<String>> results = CompletableFuture.allOf(futuresArray)
//            .thenApply(v -> futures.stream()
//                .map(CompletableFuture::join)
//                .collect(Collectors.toList()));
//            results.get().forEach(System.out::println);

//        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Hello" + Thread.currentThread().getName());
//            return "Hello";
//        });
//        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
//            System.out.println("World" + Thread.currentThread().getName());
//            return "World";
//        });
//        CompletableFuture<Void> future = CompletableFuture.anyOf(hello, world).thenAccept(System.out::println);
//        future.get();

//        //에러처리
//        boolean throwError = true;
//        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
//            if(throwError){
//                throw new IllegalArgumentException();
//            }
//            System.out.println("Hello" + Thread.currentThread().getName());
//            return "Hello";
//        }).exceptionally(ex -> {
//            System.out.println(ex);
//           return "Error!";
//        });
//        System.out.println(hello.get());

//        //에러처리
//        boolean throwError = true;
//        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
//            if(throwError){
//                throw new IllegalArgumentException();
//            }
//            System.out.println("Hello" + Thread.currentThread().getName());
//            return "Hello";
//        }).handle((result, ex) -> {
//            if(ex != null){
//                System.out.println(ex);
//                return "Error!";
//            }
//            return result;
//        });
//        System.out.println(hello.get());

/*        19. 애노테이션의 변화

        애노테이션 관련 두가지 큰 변화
        ● 자바 8부터 애노테이션을 타입 선언부에도 사용할 수 있게 됨.
        ● 자바 8부터 애노테이션을 중복해서 사용할 수 있게 됨.

        타입 선언 부
        ● 제네릭 타입
        ● 변수 타입
        ● 매개변수 타입
        ● 예외 타입
        ● ...

        타입에 사용할 수 있으려면
        ● TYPE_PARAMETER: 타입 변수에만 사용할 수 있다.
        ● TYPE_USE: 타입 변수를 포함해서 모든 타입 선언부에 사용할 수 있다.

        중복 사용할 수 있는 애노테이션을 만들기
        ● 중복 사용할 애노테이션 만들기
        ● 중복 애노테이션 컨테이너 만들기
            ○ 컨테이너 애노테이션은 중복 애노테이션과 @Retention 및 @Target이 같거나 더 넓어야 한다.

        Chicken.java (중복 사용할 애노테이션)
        @Retention(RetentionPolicy.RUNTIME)
        @Target(ElementType.TYPE_USE)
        @Repeatable(ChickenContainer.class)
        public @interface Chicken {
            String value();
        }

        ChickenContainer.java (중복 애노테이션의 컨테이너 애노테이션)
        @Retention(RetentionPolicy.RUNTIME)
        @Target(ElementType.TYPE_USE)
        public @interface ChickenContainer {
            Chicken[] value();
        }

        컨테이너 애노테이션으로 중복 애노테이션 참조하기
        @Chicken("양념")
        @Chicken("마늘간장")
        public class App {
            public static void main(String[] args) {
                ChickenContainer chickenContainer = App.class.getAnnotation(ChickenContainer.class);
                Arrays.stream(chickenContainer.value()).forEach(c -> {
                    System.out.println(c.value());
                });
            }
        }  */


    }

    static class FeelsLikeChichen<@Chicken T>{
        public static <C> void print(C c){

        }
    }

    private static CompletableFuture<String> getWorld(String message){
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("World " + Thread.currentThread().getName());
            return message + "World";
        });
    }

    private static Runnable getRunnable(String message) {
        return () -> System.out.println(message + Thread.currentThread().getName());
    }

    static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("Thread: " + Thread.currentThread().getName());
        }
    }

    private static OnlineClass createNewClass() {
        System.out.println("creating new online class");
        return new OnlineClass(10, "New class", false);
    };


}
