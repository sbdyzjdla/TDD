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

## MockitoTest
일반적인 프로그램의 구조는 아래와같다
mainApp <-> service <-> Dao <-> DB
우리는 서비스를 최소한의 종속성으로 테스트 하고싶다
Dao대신 Test Double Dao 사용, Test Double -> Mocking
* Mocking 이점
    * Class를 고립상태에서 테스트 할수있다
    * 구성과, 의존성을 최소화한다
* Mocking Framework중 왜 Mockito?
    * springboot의 transitive dependency(어떤 아티팩트를 의존성으로 추가하면 그 아티팩트가 가지고있는 의존성도 딸려오는것, spring-boot-starter-test를 가져오면 Mockito도 같이 딸려 온다
* Mockito
    * @Mock
    * @InjectMocks @Mock or @Spy로 선언된 Mock만 주입받음
* service Unit Test
    * DAO를 실행한 결과를 미리 Mocking(expectation)해 service 실행시 DAO를 직접 실행하지 않고 서비스를 테스트해볼수있다.
