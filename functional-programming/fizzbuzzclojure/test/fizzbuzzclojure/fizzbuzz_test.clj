(ns fizzbuzzclojure.fizzbuzz_test
  (:require [fizzbuzzclojure.fizzbuzz :refer [fizzbuzz_string]]))
(use 'clojure.test)

(deftest fizzbuzz_test
  (testing "Returns empty string"
    (is (= (fizzbuzz_string "") ""))))

(run-tests)