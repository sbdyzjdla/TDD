# TDD

## 테스트 주도 개발 절차
* 실패하는 테스트코드를 먼저 작성
    * 실패하는 테스트코드 작성 전까지 실제 코드를 작성하지 않는것이 중요
* 테스트코드를 성공시키기위한 코드 작성
* 리팩토링 (중복 코드 제거등)

## Junit Annotation
* @Test : 테스트 메서드로 인식하고 테스트한다.
* @DisplayName : 실행시 메서드명 대신 설정한 테스트명으로 결과 출력
* @BeforeAll : 해당 테스트클래스를 실행하기전 딱 한번 수행됨, 이 메소드는 static으로 선언해야함
* @AfterAll : 모든 메서드 실행 후 마지막에 딱 한번 수행, static
* @BeforeEach : 모든 메서드가 실행 전 수행
* @AfterEach : 모든 메서드가 실행 후 수행

* 테스트케이스 실행 순서
    * @TestMethodOrder(MethodOrderer.MethodName.class)
    * @TestMethodOrder(MethodOrderer.DisplayName.class)
    * @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        * @Order(i) : 순성 지정
    * @TestMethodOrder(MethodOrderer.Random.class)


### Test coverage : 얼마나 테스트가 충분한가를 나타낸 것이다. 즉, 수행한 테스트가 테스트의 대상을 얼마나 커버했는지를 나타낸다. 테스트가 코드를 얼마나 사용했는지 알수 있는 척도 
#### Test coverage는 현업에서 7~80%정도가 적당하다

## SpringBoot Test
* SpringBoot 테스트시 테스트할 클래스와 동일한 패키지로 테스트 패키지를 만들던가 @SpringBootTest(classes = MvcTestingExampleApplication.class) 이처럼 테스트할 클래스를 명시해야한다.