export function Header({title, index, sizeList }) {
    return (
        <div>
            <h1>{title}</h1>
            <p>({index} of {sizeList})</p>
        </div>
    )
}