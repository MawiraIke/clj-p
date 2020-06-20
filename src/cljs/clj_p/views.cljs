(ns clj-p.views
  (:require
    [re-frame.core :as re-frame]
    [re-com.core :as re-com]
    [clj-p.subs :as subs]
    ))

(defn image-section
  []
  [re-com/v-box
   :height "50%"
   :children [[:img {:src "images/code.jpeg"
                     :alt "Computer"}]]])

(defn text-overlay
  []
  [re-com/h-box
   :style {:position "absolute"
           :top      "40%"
           :left     "5%"}
   :children [[re-com/v-box
               :children [[re-com/title
                           :style {:color "white"}
                           :level :level2
                           :label "Ike Mawira"]
                          [re-com/title
                           :style {:color "white"}
                           :level :level3
                           :label "CS Student, Software Developer."]]]]]
  )

(defn minor-space
  []
  [:div {:class "minor-space"}])

(defn minor-horizontal-space
  []
  [:div {:class "minor-horizontal-space"}])

(defn myoozik-project
  []
  [:div {}
   [re-com/v-box
    :children [[minor-space]
               [re-com/title
                :style {:margin "auto"}
                :level :level3
                :label "Main Project highlight"]
               [minor-space]
               [re-com/h-box
                :children [[minor-horizontal-space]
                           [:img {:src   "images/myoozik-logo.png"
                                  :alt   "Myoozik"
                                  :class "myoozik"}]
                           [re-com/h-box
                            :size "1"
                            :children [[:p ""]]]
                           [re-com/h-box
                            :style {:padding "75px 0px"}
                            :children [[:a {:href "https://bit.ly/myoozik-website"
                                            :class-name "myoozik-link"}
                                        "Myoozik - Play & Share music"]]]
                           [minor-horizontal-space]]]
               [minor-space]]]])

(defn space-add-with-pdf
  []
  [:div {:class "spacer-with-pdf"}
   [:a {:class "resume-link"
        :href  "docs/Ike Mawira.pdf"} "Click here for resume as PDF"]])

(defn copyright
  []
  [:div {:class "copyright-contain"}
   [:p "Ike Mawira 2020"]])

(defn social-links
  []
  [re-com/h-box
   :justify :between
   :children [[:a {:class "col-md-2" :href "mailto:mawiraike@gmail.com"}
               [re-com/title
                :style {:color "white"}
                :label "EMAIL"]]
              [:a {:class "col-md-2" :href "https://www.linkedin.com/in/ike-mawira-706974163"}
               [re-com/title
                :style {:color "white"}
                :label "LINKED-IN"]]
              [:a {:class "col-md-2" :href "https://github.com/MawiraIke"}
               [re-com/title
                :style {:color "white"}
                :label "GITHUB"]]
              [:a {:class "col-md-2" :href "https://stackoverflow.com/users/10081740/ike-mawira"}
               [re-com/title
                :style {:color "white"}
                :label "STACK OVERFLOW"]]
              [:a {:class "col-md-2" :href "https://twitter.com/ike__dev"}
               [re-com/title
                :style {:color "white"}
                :label "TWITTER"]]
              [:a {:class "col-md-2" :href "https://www.buymeacoffee.com/ikeM"}
               [re-com/title
                :style {:color "white"}
                :label "BUY ME A COFFEE"]]]])

(defn main-panel []
  [re-com/v-box
   :children [[:div {:class "contain"}
               [image-section]
               [text-overlay]]
              [:div {:class "spacer"}]
              [myoozik-project]
              [space-add-with-pdf]
              [:footer {:class "footer-c"}
               [minor-space]
               [social-links]
               [minor-space]]]])
