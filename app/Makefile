.PHONY: build run-dist lint

build:
	./gradlew build

run-dist: build
	./build/install/app/bin/app

lint:
	./gradlew spotlessCheck
