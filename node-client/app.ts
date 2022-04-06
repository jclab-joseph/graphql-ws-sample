import { ApolloClient } from '@apollo/client'
import { InMemoryCache } from '@apollo/client/core';
import { WebSocketLink } from './apollo-graphql-ws-link';
import gql from 'graphql-tag';
import * as ws from 'ws';

const wsLink = new WebSocketLink({
  url: `ws://localhost:9000/graphql`,
  webSocketImpl: ws.WebSocket,
});

// Create client with links
// distinguish between subscriptions, queries and mutations
// ws link should handle subscriptions
// http link should handle mutations and queries
export const client = new ApolloClient({
  link: wsLink,
  cache: new InMemoryCache(),
  connectToDevTools: true,
});

client.query({
  query: gql`query Test { hello }`
})
.then((res) => {
  console.log(res);
})
.catch((err) => console.error(err));
