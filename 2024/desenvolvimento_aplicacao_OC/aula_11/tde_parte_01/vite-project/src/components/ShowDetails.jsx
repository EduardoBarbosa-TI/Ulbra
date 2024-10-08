import { useState } from "react"

export function ShowDetails({description}) {
    const [enable, setEnable] = useState(false)

    function handleClickEnabledDetails() {
        setEnable(!enable)
    }

    return (
        <div>
            {enable && <p>{description}</p>}
            <button onClick={handleClickEnabledDetails}>{enable ? "Hide" : "Show"} Details</button>
        </div>
    )
}