package Lab9.ch1;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;

public class Main {
        Flux<String> emptyFlux(){
            return Flux.empty();
        }

        Flux<String> fooBarFluxFromValues(){
            return Flux.just("foo","bar");
        }

    Flux<String> fooBarFluxFromList(){
        return Flux.fromIterable(Arrays.asList("foo","bar"));
    }

        Flux<String> errorFlux(){
            return Flux.error(new Error());
        }

    static Flux<Long> counter() {
        return Flux.interval(Duration.ofMillis(100)).take(10);
    }


    public static void main(String[] args) {

    }
    }

