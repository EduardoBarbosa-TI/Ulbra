import { useState } from "react";
import { data } from "../assets/data";
import { Profile } from "./Profile";

export function Gallery() {
   const [index, setIndex] = useState(0);
    const theme = {background: "blue", color: "black", padding: 20}

    let galleryData01 = data[0];
    let galleryData02 = data[1];
    return (
        <div>
            <h1 style={theme}>Galeria do Edu</h1>
            <Profile data={galleryData01}/>
            <Profile data={galleryData02}/>
        </div>

    )
}