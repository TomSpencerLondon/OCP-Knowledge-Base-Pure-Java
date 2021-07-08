import React, { useEffect, useState } from "react";

const Counter = () => {
  const [count, setCount] = useState<number>(0);

  useEffect(() => {
    if(count === 5) {
      console.log("Count is five");
    }
  }, [count]);

  const increaseCount = () => {
    const current = count + 1;
    setCount(current);
  };

  return (
    <button onClick={ increaseCount }>{count}</button>
  );
};

export default Counter;
