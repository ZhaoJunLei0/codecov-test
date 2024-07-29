# codecov-test

java 集成 openclover

    mvn clean clover:setup test clover:aggregate clover:clover

    name: Workflow for Codecov Java
    on: [push, pull_request]
    jobs:
    run:
    runs-on: ubuntu-latest
    steps:
    - name: Checkout
    uses: actions/checkout@v4
    with:
    fetch-depth: 0
      - name: Set up JDK 8
        uses: actions/setup-java@v4
        with:
          distribution: 'temurin'
          java-version: '8'
      - name: Build with Maven and generate coverage report
        run: mvn clean clover:setup test clover:aggregate clover:clover
      - name: List generated files
        run: ls -R ./target/site/clover
      - name: Upload coverage reports to Codecov
        uses: codecov/codecov-action@v4
        with:
          files: ./target/site/clover/clover.xml
        env:
          CODECOV_TOKEN: ${{ secrets.CODECOV_TOKEN }}


集成 codeCove：

    mvn test

    name: Workflow for Codecov Java
    on: [push, pull_request]
    jobs:
    run:
    runs-on: ubuntu-latest
    steps:
    - name: Checkout
    uses: actions/checkout@v4
    with:
    fetch-depth: 0
      - name: Set up JDK 8
        uses: actions/setup-java@v4
        with:
          distribution: 'temurin'
          java-version: '8'
      - name: Build with Maven and generate coverage report
        run: mvn test
      - name: List generated files
        run: ls -R ./target/jacoco-report
      - name: Upload coverage reports to Codecov
        uses: codecov/codecov-action@v4
        with:
          files: ./target/jacoco-report/jacoco.xml
        env:
          CODECOV_TOKEN: ${{ secrets.CODECOV_TOKEN }}
