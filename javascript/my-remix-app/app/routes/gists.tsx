import React from "react";
import type { LoaderFunction } from "remix";
import { useRouteData } from "remix";

export let loader: LoaderFunction = () => {
  return fetch("https://api.github.com/gists");
}

export function meta() {
  return {
    title: "Public Gists",
    description: "View the latest gists from the public"
  };
}

export default function Gists() {
  let data = useRouteData();
  console.log(data);

  return (
    <div>
      <h2>Public Gists</h2>
    </div>
  );
}
