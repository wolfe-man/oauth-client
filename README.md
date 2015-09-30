## Client OAuthentication (OAuth)

A Clojure library designed to provide a user [OAuthentication] (http://oauth.net/2/).

Link on [Clojars] (https://clojars.org/org.clojars.cwolfe/oauth-client).

# Requirements
- Client ID
- Client Secret
- Username
- Password
- Security Key (optional)

# Usage

## Installing

[![Clojars Project](http://clojars.org/org.clojars.cwolfe/oauth-client/latest-version.svg)](http://clojars.org/org.clojars.cwolfe/oauth-client)

## Client OAuth Example
```clojure
    (require [oauth-client.core :as oauth])
```
**Prerequisites:**
- registered application with thrid party

**Step 1:**
- Create a agent to access the registered application.
```clojure
    (def agent
      (oauth/build-oauth <client-id>
                         <client-secret>
                         <username>
                         <password>
                         <security-token>))
```
  **remember the security-token is optional**

**Step 2:**
- Send the agent to fetch a authorization token.
```clojure
    (def authorization-token
      (oauth/get-access-token agent <request-url>))
```

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
