package me.whiteship.java8to11;

import java.time.Duration;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
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

    }

    private static OnlineClass createNewClass() {
        System.out.println("creating new online class");
        return new OnlineClass(10, "New class", false);
    };


}
