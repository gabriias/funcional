(ns baby-steps-in-clojure.using-schemas
  (:require [schema.core :as s]))

(s/defschema PessoaSchema
  {:nome  s/Str
   :idade s/Int})

(s/defn mostrar-idade :- s/Str
  [idade :- s/Int]
  ;(s/validate s/Int idade)
  (str "a idade é: " idade))

(s/defn mostrar-nome-e-idade :- s/Str
  [{:keys [nome idade] :as pessoa} :- PessoaSchema]
  ;(s/validate PessoaSchema pessoa)
  (str "olá " nome " sua idade é: " idade))
