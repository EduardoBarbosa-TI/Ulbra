export function Image({urlImage, alt}) {
    return (
        <img src={urlImage} width={250} height={250} alt={alt} />
    )
}