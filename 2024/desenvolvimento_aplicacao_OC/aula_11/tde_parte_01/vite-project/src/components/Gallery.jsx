import { useState } from "react";
import { Button } from "./Button";
import { Header } from "./Header";
import { Image } from "./Image";
import { ShowDetails } from "./ShowDetails";
import { data } from "../assets/data";


export function Gallery() {
    const [index, setIndex] = useState(0)

    function handleClickNextIndex(){
        if(index + 1 != data.length)
        setIndex(index + 1)
    }

    function handleClickPreviousIndex(){
        if(index - 1 != data.length)
        setIndex(index - 1)
    }

    let galleryData = data[index]

    return (
        <>
            <div style={{height: "400px", width: "100%" }}>
                <Button clickNext={handleClickNextIndex} clickPrevious={handleClickPreviousIndex}/>
                <Header title={galleryData.name} sizeList={data.length} index={index + 1}/>
                <ShowDetails description={galleryData.description}/>
                <Image urlImage={galleryData.url} alt={galleryData.alt}></Image>
            </div>
        </>
    )
}
