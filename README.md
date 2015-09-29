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

Add [org.clojars.cwolfe/oauth-client "1.0.0-SNAPSHOT"] to your project.clj file as a Leinigen dependency to get the latest release.
run lein deps

## Client OAuth Example

    (require [oauth-client.core :as oauth])

**Prerequisites:**
- registered application with thrid party

**Step 1:**
- Create a agent to access the registered application.

    (def agent
      (oauth/build-oauth <client-id>
                         <client-secret>
                         <username>
                         <password>
                         <security-token>))

  **remember the security-token is optional**

**Step 2:**
- Send the agent to fetch a authorization token.

    (def authorization-token
      (oauth/get-access-token agent <request-url>))


## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
