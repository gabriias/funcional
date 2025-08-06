(ns baby-steps-in-clojure.core-test
  (:require [clojure.test :refer :all]
            [baby-steps-in-clojure.core :as core]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest saudacao-test
  (testing "Testa se a saída da função é o esperado"
    (is (= "Olá, Gabi!"
           (core/saudacao "Gabi")))))

(deftest quadrado-test
  (testing "Testa se a saída da função é o esperado"
    (is (= 49
           (core/quadrado 7)))))
