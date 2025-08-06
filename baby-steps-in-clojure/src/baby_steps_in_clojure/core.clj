(ns baby-steps-in-clojure.core)

;; Hello World para começar bem :)
;(println "Hello, World!")

;; "Variáveis" (em clojure tudo é constante)
;; não precisa declarar o tipo (mas é bom)
;; os tipos são verificados em tempo de execução
(def nome "Gabriela")
(def idade 95)

;; Funções (tudo é função)
(defn saudacao [nome]
  (str "Olá, " nome "! 👋🏽"))

;; Coleções

;; lista/vetor
;; permite elementos duplicados
;; assoc/conj
(def numeros [1 2 3 4 5])

;; conjunto/hash
;; não permite elementos duplicados
;; conj
(def letras #{"a" "b" "c"})

;; mapa/array
;; assoc/conj
(def pessoa {:nome "Ana" :idade 25})

;; Manipulação de funções
;; (map inc numeros) ;; => (2 3 4 5 6)
;; (filter even? numeros) ;; => (2 4)

(defn dobro [x] (* 2 x))
(defn quadrado [x] (* x x))
(def processar-quadrado-do-dobro (comp quadrado dobro))

;; thread first?
;(-> 3
;    dobro
;    quadrado)

;; thread last?
;(->> numeros
;     (map quadrado)
;     (reduce +))

;; Condicionais

;; if
(defn valida-idade
  [idade]
  (if (>= idade 18)
    "Pode votar ✅"
    "Não pode votar ❌"))

;; cond
(defn valida-nota
  [nota]
  (cond
    (< nota 5) "Reprovado 💀"
    (< nota 7) "Recuperação 🥶"
    :else "Aprovado 🥳"))

;; when
(defn valida-numero
  [numero]
  (when (> numero (+ 1 (rand-int 10)))
    (println "Magicamente, o número é maior 🧙🏽")))
(defn valida-numero-let
  [numero]
  (let [random (+ 1 (rand-int 10))]
    (when (> numero random)
      (println "Magicamente, o número é maior que " random " 🧙🏽"))))

