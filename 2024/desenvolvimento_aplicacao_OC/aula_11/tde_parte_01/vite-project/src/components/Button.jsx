export function Button({ clickNext, clickPrevious }) {
    return (
        <div>
            <button type="button" onClick={clickPrevious}>Previous</button>
            <button type="button" onClick={clickNext}>Next</button>          
        </div>
    ) 
 }