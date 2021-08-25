import React from "react";
import { screen } from "@testing-library/react";

import Homepage from "../../src/pages";
import { render } from "../helpers/testUtils";

test("should pass", () => {
  // Date       ||  Description     || image
  // 14/01/2021 ||  Nice surf spot  || URL

  render(<Homepage />);

  expect(screen.getByText("Hello world")).toBeInTheDocument();
});
