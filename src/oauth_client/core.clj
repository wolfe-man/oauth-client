(ns oauth-client.core
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]
            ))

(defn build-oauth
  ([client-id client-secret username password security-token]
   {:client-id (str "client_id=" client-id)
    :client-secret (str "client_secret=" client-secret)
    :username (str "username=" username)
    :password (str "password=" password)
    :security-token security-token}
   )
  ([client-id client-secret username password]
   {:client-id (str "client_id=" client-id)
    :client-secret (str "client_secret=" client-secret)
    :username (str "username=" username)
    :password (str "password=" password)}
   ))

(defn get-access-token [build-oauth request-url]
  (let [oauth (str (:client-id build-oauth) "&"
                   (:client-secret build-oauth) "&"
                   (:username build-oauth) "&"
                   (:password build-oauth)
                   (:security-token build-oauth))]
    (as-> oauth %
          (str request-url "&" %)
          (client/post %)
          (:body %)
          (json/read-str % :key-fn keyword)
          (:access_token %)
          )
    ))
