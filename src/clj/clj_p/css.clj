(ns clj-p.css
  (:require [garden.def :refer [defstyles]]))

(defstyles screen
  [:body {:color "red"}]
  [:.level1 {:color "green"}])
