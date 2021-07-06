import React, { FC, useEffect, useState } from "react";
import { Book } from "../entities/Book";
import { getBook } from "../api/api";

type Props = {
  id: string;
};

const BookCard: FC<Props> = ({ id }: Props) => {
  const [book, setBook] = useState<Book>();

  useEffect(() => {
    getBook(id).then((b) => setBook(b));
  });

  return <article>{book?.name}</article>;
};

export default BookCard;
