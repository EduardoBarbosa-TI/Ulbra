import { Header } from "../components/Header";
import { Title } from "../components/Title";
import { Button } from "../components/Button";
import { DataCep } from "../components/DataCep";
import { Forms } from "../components/Forms";
import { Card } from "../components/Card";
import { useState } from "react";
import { Footer } from "../components/Footer";

export function Home() {
    const [cards, setCards] = useState([]);

    const addCard = (newCard) => {
        setCards([...cards, newCard]); 
    };

    return (
        <>
            <Header />
            <section>
                <Title name="Eduardo Barbosa" />
                <DataCep />
            </section>
            <section id="section-form">
                <div className="coll-card">
                    {cards.map((card, index) => (
                        <Card
                            key={index}
                            image={card.image}
                            name={card.name}
                            category={card.category}
                            status={card.status}
                        />
                    ))}
                </div>
                <Forms addCard={addCard} />
            </section>
            <Footer/>     
        </>
    )
}