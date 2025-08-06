(ns baby-steps-in-clojure.using-schemas-test
  (:require [clojure.test :refer :all]
            [baby-steps-in-clojure.using-schemas :as using-schemas]
            [schema.test :as st]))

(st/deftest mostrar-idade-test
  (testing "Testa se a entrada/saída da função é o esperado"
    (testing "O schema.test (da biblioteca prismatic) aplica o validate para a gente"
      (is (= "a idade é 42"
             (using-schemas/mostrar-idade 42))))))
