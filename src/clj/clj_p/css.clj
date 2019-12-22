(ns clj-p.css
  (:require [garden.def :refer [defstyles]]))

(defstyles screen
           [:body {:color "red"}]

           ;; Adds a black background to the top navigation bar
           [:.topnav {:background-color "#333333"
                      :overflow         "hidden"}]

           ;; Style the links inside the navigation bar
           [:.topnav [:a {:float           "left"
                          :color           "#f2f2f2"
                          :text-align      "center"
                          :padding         "14px 16px"
                          :text-decoration "none"
                          :font-size       "17px"}]]

           ;; Style the links inside the navigation bar on hover
           [:.topnav [:a:hover {:background-color "#dddddd"
                                :color            "black"}]]

           ;; Style the active link in the navigation bar
           [:.topnav [:a.active {:background-color "#4caf50"
                                 :color            "white"}]]

           ;; Image styling
           [:img {:width      "100%"
                  :height     "200px"
                  :object-fit "cover"}]

           [:.contain {:position   "relative"
                       :text-align "center"
                       :color      "white"}]

           [:.center-text {:position  "absolute"
                           :top       "50%"
                           :left      "50%"
                           :transform "translate(-50%, -50%)"}]

           [:.center-text [:p {:font-size "20px"}]]

           [:.spacer {:height           "150px"
                      :background-color "#dee3e0"}]

           [:.spacer-with-pdf {:height           "250px"
                               :background-color "#242424"
                               :color            "white"
                               :position         "relative"
                               :text-align       "center"}]

           [:.spacer-with-pdf [:a {:color     "white"
                                   :position  "absolute"
                                   :top       "35%"
                                   :left      "50%"
                                   :transform "translate(-50%, -50%)"}]]

           [:.footer-c {:background-color "#967850"
                        :position         "relative"
                        :text-align       "center"
                        :color            "#5c5c5c"}]

           ;; Clear the floats after the columns
           [:.row:after {:content "\"\""
                         :display "table"
                         :clear   "both"}]

           [:.copyright-contain {:color "white"}]

           [:.minor-space {:width  "100%"
                           :height "20px"}]

           )
