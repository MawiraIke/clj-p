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
   :justify :around
   :children [[:a {:class "col-md-2" :href "mailto:mawiraike@gmail.com"}
               [re-com/h-box
                :size "1"
                ;;:justify :center
                :children [[:img {:src "images/email.svg"
                                  :alt "Email"
                                  :class "footer-img"}]]]]
              [:a {:class "col-md-2" :href "https://www.linkedin.com/in/ike-mawira-706974163"}
               [re-com/h-box
                :size "1"
                :justify :center
                :children [[:img {:src "images/linkedin.svg"
                                  :alt "Linkedin"
                                  :class "footer-img"}]]]]
              [:a {:class "col-md-2" :href "https://github.com/MawiraIke"}
               [re-com/h-box
                :size "1"
                :justify :center
                :children [[:img {:src "images/github.svg"
                                  :alt "GitHub"
                                  :class "footer-img"}]]]]
              [:a {:class "col-md-2" :href "https://stackoverflow.com/users/10081740/ike-mawira"}
               [re-com/h-box
                :size "1"
                :justify :center
                :children [[:img {:src "https://img.icons8.com/color/48/000000/stackoverflow.png"
                                  :alt "Stack overflow"
                                  :class "footer-img"}]]]]
              [:a {:class "col-md-2" :href "https://twitter.com/ike__dev"}
               [re-com/h-box
                :size "1"
                :justify :center
                :children [[:img {:src "images/twitter.svg"
                                  :alt "Twitter"
                                  :class "footer-img"}]]]]
              [:a {:class "col-md-2" :href "https://www.buymeacoffee.com/ikeM"}
               [re-com/h-box
                :size "1"
                :justify :end
                :children [[:img {:src "images/bmac.svg"
                                  :alt "Buy me a coffee"
                                  :class "footer-img"}]]]]]])

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
